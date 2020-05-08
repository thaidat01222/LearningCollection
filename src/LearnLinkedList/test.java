package LearnLinkedList;

import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        CloneLinkedList cloneLinkedList = new CloneLinkedList();
        cloneLinkedList.add("a");
        cloneLinkedList.add("b");
        cloneLinkedList.add("c");
        cloneLinkedList.showAll();
        cloneLinkedList.showAll();
        cloneLinkedList.update("a", "d");
        cloneLinkedList.showAll();
        cloneLinkedList.remove("b");
        cloneLinkedList.showAll();
        cloneLinkedList.search("a");
    }
}
