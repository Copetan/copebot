package methodsnstuff;

import adts.Stack;

public class Calculator {

    public double calculate(String toAdd){


        return calculatePostfix(toAdd);
    }

    private String postfixToInfix(String toConvert ){
        return "";
    }


    private Double calculatePostfix(String postFixExpression){

        boolean hasErrored = false;

        Stack Numbers = new Stack();

        for(int i = 0; i < postFixExpression.length(); i++){
            if(isOperator(postFixExpression.charAt(i)) && hasErrored == false){

                //this can fail if there is a malformed equation
                try{
                    //Get two numbers from the stack and store them in variables
                    int num1 = (Integer)Numbers.pop();
                    int num2 = (Integer)Numbers.pop();
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
                Numbers.push(Character.getNumericValue(postFixExpression.charAt(i)));
            }
        }

        //print the result when finished - This could fail if the previous try{} failed
        //This will only run if the stack contains one item and an error has not occured.
        if(Numbers.getSize() == 1 && hasErrored == false){
            System.out.println("The answer is: " + Numbers.pop());
        }else{
            System.out.println("Unable to return an answer!");
        }


        return 0.0;

    }


    private boolean isOperator(char i){
        return i == '+' || i == '-' || i == '*' || i == '/' || i == '%';
    }

    private static int performOperation(char operator, int num1, int num2) throws IllegalArgumentException{
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
