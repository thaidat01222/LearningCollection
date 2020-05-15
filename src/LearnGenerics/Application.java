package LearnGenerics;

public class Application {

    public static void main(String[] args) {
        CloneLinkedList<String> cloneLinkedList = new CloneLinkedList<>();
        cloneLinkedList.showAll();
        System.out.println("=====================");
        cloneLinkedList.add("1");
        cloneLinkedList.add("2");
        cloneLinkedList.add("3");
        cloneLinkedList.showAll();
        System.out.println("=====================");
        cloneLinkedList.remove("1");
        cloneLinkedList.showAll();
        System.out.println("=====================");
        cloneLinkedList.remove("5");
        cloneLinkedList.showAll();
        System.out.println("=====================");
        cloneLinkedList.remove("3");
        cloneLinkedList.showAll();
        System.out.println("=====================");

        Integer[] is = {1, 2, 3, 4, 5,};
        showArray(is);

        String[] ss = {"a", "b", "c"};
        showArray(ss);
    }

    public static <T> void showArray(T[] arr) {
        for (T s : arr) {
            System.out.print(s + " ");
        }
    }
}
