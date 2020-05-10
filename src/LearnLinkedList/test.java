package LearnLinkedList;

public class test {
    public static void main(String[] args) {
        CloneLinkedList cloneLinkedList = new CloneLinkedList();
        cloneLinkedList.add("a");
        cloneLinkedList.add("b");
        cloneLinkedList.add("c");
        cloneLinkedList.showAll();

        cloneLinkedList.update("a", "d");
        cloneLinkedList.showAll();

        cloneLinkedList.remove("b");
        cloneLinkedList.showAll();

        cloneLinkedList.search("b");
    }
}
