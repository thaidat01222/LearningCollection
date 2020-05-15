package LearnGenerics;

public class CloneLinkedList<T> {
    private Node<T> head;
    //todo: inc / desc size when adding / removing
    private int size;

    public void add(T content) {
        if (head == null) {
            Node<T> node = new Node<>();
            node.setContent(content);
            head = node;
        } else {
            Node<T> current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            Node<T> lastNode = new Node<>();
            lastNode.setContent(content);
            lastNode.setPrevNode(current);
            current.setNextNode(lastNode);
        }
    }

    public void remove(T content) {
        Node<T> current = head;
        if (current == null) {
            return;
        }
        do {
            if (current.getContent().equals(content)) {
                Node<T> prevNode = current.getPrevNode();
                Node<T> nextNode = current.getNextNode();
                if (prevNode != null) {
                    prevNode.setNextNode(nextNode);
                } else {
                    // prevNode == null => current is head
                    head = nextNode;
                }
                if (nextNode != null) {
                    nextNode.setPrevNode(prevNode);
                }
                return;
            } else {
                current = current.getNextNode();
            }
        } while (current != null);
    }

    public void showAll() {
        Node<T> current = head;
        if (current == null) {
            System.out.println("nothing");
            return;
        }
        do {
            System.out.println(current.getContent());
            current = current.getNextNode();
        } while (current != null);
    }
}
