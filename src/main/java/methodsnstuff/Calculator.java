//Thomas Wessel 2019


/*
//TODO
1. Convert infix to postfix - DONE
2. Calculate the result of a postfix equation - DONE

*/

package methodsnstuff;

import adts.Stack;

public class Calculator {

    /**
     * -----------------------------------------------------------------------+
     * These methods are what should be called. All others should be private. |
     * -----------------------------------------------------------------------+
     **/

    public String calculateInfix(String toAdd){
        String fixedInput = infixToPostfix(toAdd);
        return calculatePostfix(fixedInput);
    }

    public String getPostfix(String toConvert){
        return infixToPostfix(toConvert);
    }

    /**
    *---------------------------------------------------------+
    * This set of methods converts a infix equation to postfix|
    * -Private                                                |
    *---------------------------------------------------------+
    **/
    private int getPrecedence(char toCheck){
        if(toCheck == '+' || toCheck == ('-')){
            return 1;
        }
        else if(toCheck == '*' || toCheck == '/' || toCheck == '%'){
            return 2;
        }
        else{
            //It shouldn't get here...
            return -1;
        }
    }

    private String infixToPostfix(String toConvert ){

        String toReturn = "";

        Stack stack = new Stack();

        for(int i = 0; i < toConvert.length(); i++){
            //get the char at i
            char current = toConvert.charAt(i);

            //Now we need to test to see what current is

            //first see if current is a digit
            if(Character.isDigit(current)){
                toReturn += current;

            }else if(current == '('){
                stack.push(current);
            }else if(current == ')'){
                //If this is encountered, there *should* be a ( somewhere in the stack.
                while(!stack.isEmpty() && (Character) stack.peek() != '('){
                    toReturn += stack.pop();
                }

                if(!stack.isEmpty() && (Character) stack.peek() != '('){
                    //welp, the previous comment was wrong...
                    return "Invalid equation!";
                }else{
                    stack.pop();
                }
            }else{
                //if the program gets here, we have an operator
                while (!stack.isEmpty() && getPrecedence(current) <= getPrecedence((Character) stack.peek())){
                    toReturn += stack.pop();
                }
                stack.push(current);
            }
        }

        //finally, pop remaining operators
        while(!stack.isEmpty()){
            toReturn += stack.pop();
        }
        System.out.println("The equation is: " + toReturn);
        return toReturn;
    }


    /**
     * --------------------------------------+
     * @param postFixExpression              |
     * @return String containing the result  |
     *---------------------------------------+
     */
    //The following methods are all to calculate an equation given in postfix form
    private String calculatePostfix(String postFixExpression){

        boolean hasErrored = false;

        Stack Numbers = new Stack();

        for(int i = 0; i < postFixExpression.length(); i++){
            if(isOperator(postFixExpression.charAt(i)) && hasErrored == false){

                //this can fail if there is a malformed equation
                try{
                    //Get two numbers from the stack and store them in variables
                    Double num1 = (Double)Numbers.pop();
                    Double num2 = (Double)Numbers.pop();
                    //perform operation and push the result from the stack
                    Numbers.push(performOperation(postFixExpression.charAt(i), num1, num2 ));

                }catch(Exception e){
                    //if it does fail, it will be because of a malformed equation
                    System.out.println("ERROR: Malformed Equation. Please Try Again!");
                    hasErrored = true;
                }
            }
            //While the specification only wants one long string, this method is a bit more robust
            // as it can take a string in any format as long as there are digits entered
            else if(Character.isDigit(postFixExpression.charAt(i))){
                double toPush = Character.getNumericValue(postFixExpression.charAt(i));
                Numbers.push(toPush);
            }
        }

        //print the result when finished - This could fail if the previous try{} failed
        //This will only run if the stack contains one item and an error has not occured.
        if(Numbers.getSize() == 1 && hasErrored == false){
            return("The answer is: " + Numbers.pop());
        }else{
            return("No");
        }
    }

    private boolean isOperator(char i){
        return i == '+' || i == '-' || i == '*' || i == '/' || i == '%';
    }

    private static double performOperation(char operator, double num1, double num2) throws IllegalArgumentException{
        if(operator == '+'){
            return num1 + num2;
        }
        else if(operator == '-'){
            return num2 - num1;
        }
        else if(operator == '*'){
            return num1 * num2;
        }
        else if(operator == '/'){
            return num2 / num1;
        }
        else if(operator == '%'){
            return num2 % num1;
        }
        else{
            //I didn't bother to catch this because it should be impossible to get here...
            //Watch someone show me an obvious flaw in my code that catching this error
            //could have prevented.
            throw new IllegalArgumentException("Invalid Operator");
        }

    }

}
