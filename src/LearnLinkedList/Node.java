package LearnLinkedList;

public class Node {
    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public Node getForwardNode() {
        return forwardNode;
    }

    public void setForwardNode(Node forwardNode) {
        this.forwardNode = forwardNode;
    }

    public String getThisNode() {
        return thisNode;
    }

    public void setThisNode(String thisNode) {
        this.thisNode = thisNode;
    }

    private Node previousNode;
    private Node forwardNode;
    private String thisNode;
    public Node(Node previousNode , String thisStudent, Node forwardNode){
        this.forwardNode = forwardNode;
        this.thisNode = thisStudent;
        this.previousNode = previousNode;
    }
}
