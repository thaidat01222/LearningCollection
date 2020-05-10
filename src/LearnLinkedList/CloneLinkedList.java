package LearnLinkedList;

public class CloneLinkedList {
    public int size = 0;
    public Node headNode = null;

    public void add(String content) {
        if (this.size == 0) {
            headNode = new Node(null, content, null);
            size++;
        } else {
            Node currentNode = headNode;
            while (currentNode.getForwardNode() != null) {
                currentNode = currentNode.getForwardNode();
            }
            Node node = new Node(currentNode, content, null);
            currentNode.setForwardNode(node);
        }
    }

    public void remove(String content) {
        Node currentNode = headNode;
        while (!currentNode.getThisNode().equals(content)) {
            currentNode = currentNode.getForwardNode();
        }
        Node newFowardNodeOfPreviousNode = currentNode.getForwardNode();
        currentNode.getPreviousNode().setForwardNode(newFowardNodeOfPreviousNode);

        Node newPreviousNodeOfFowardNode = currentNode.getPreviousNode();
        currentNode.getForwardNode().setPreviousNode(newPreviousNodeOfFowardNode);
        size--;
    }

    public void update(String content, String newContent) {
        Node currentNode = headNode;
        while (!currentNode.getThisNode().equals(content)) {
            currentNode = currentNode.getForwardNode();
        }
        currentNode.setThisNode(newContent);
    }

    public void showAll() {
        Node currentNode = headNode;
        while (currentNode.getForwardNode() != null) {
            System.out.println(currentNode.getThisNode());
            currentNode = currentNode.getForwardNode();
        }
        System.out.println(currentNode.getThisNode());
    }

    public boolean nodeNull(Node node){
        if(node.getThisNode() == null){
            return true;
        }
        else return false;
    }
    public void search(String content) {
        Node currentNode = headNode;
        int index = 0;
        while (currentNode.getThisNode() != null) {
            if (currentNode.getThisNode() == content) {
                System.out.println("| index : " + index);
                return;
            }
            else {
                currentNode = currentNode.getForwardNode();
                index++;
                if(currentNode == null){
                    System.out.println("ko tim thay ");
                    return;
                }
            }
        }
    }
}
