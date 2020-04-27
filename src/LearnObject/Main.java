package LearnObject;

import java.util.HashMap;

//toString
//hashCode
public class Main {
    public static void main(String[] args) {
        Student studentA = new Student(0, "quang");
        Student studentB = new Student(1, "dat");
        System.out.println(studentA);
        System.out.println(studentB);
        System.out.println(studentA.hashCode());
        System.out.println(studentB.hashCode());
        HashMap<Student,Float> map = new HashMap<>();
        map.put(studentA,10f);
        map.put(studentB,9.6f);
    }
}
