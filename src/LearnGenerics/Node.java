package LearnGenerics;

public class Node<T> {
    private T content;
    private Node<T> prevNode;
    private Node<T> nextNode;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
