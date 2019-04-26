package adts;

public class Node {
    private Object containedItem;
    private Node nextNode;

    //Constructors
    public Node(){
        containedItem = null;
        setNextNode(null);
    }

    public Node(Object newObj){
        containedItem = newObj;
        nextNode = null;
    }

    //Double Arg Constructor
    public Node(Object newObj, Node newNext){
        containedItem = newObj;
        nextNode = newNext;
    }

    //methods
    public Object getcontainedItem(){
        return containedItem;
    }

    public Node getNextNode(){
        return nextNode;
    }

    public void setContainedItem(Object newObj){
        containedItem = newObj;
    }

    public void setNextNode(Node newNext){
        nextNode = newNext;
    }
}
