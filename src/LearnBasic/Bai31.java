package LearnBasic;
import java.util.ArrayList;

import static java.lang.System.*;

public class Bai31 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        listA.add("1");
        listA.add("2");
        listA.add("3");
        listA.add("4");
        listA.add("5");
        listA.add("6");
        listB.add("1");
        listB.add("2");
        listB.add("3");
        listB.add("7");
        listB.add("8");
        listB.add("9");
        listB.add("10");
        out.println("listA :");
        out.println(listA);
        out.println("listB :");
        out.println(listB);
        out.println("=======================================");

        out.println("Cau b");
        Bai31 bai31 = new Bai31();
        ArrayList<String> listC = bai31.Hop_Hai_Tap_Hop(listA,listB);
        out.println(listC);
        out.println("=======================================");

        out.println("Cau c");
        ArrayList<String> listD = bai31.Giao_Hai_Tap_Hop(listA,listB);
        out.println(listD);
        out.println("=======================================");

        out.println("Cau d");
        ArrayList<String> listE = bai31.Bu_Hai_Tap_Hop(listA,listB);
        out.println(listE);
        out.println("=======================================");

    }
    public ArrayList<String> Hop_Hai_Tap_Hop(ArrayList<String> A, ArrayList<String> B){
        ArrayList<String> C = new ArrayList<>();
        C.addAll(A);
        for(int i = 0 ; i<B.size(); i++){
            String temp = B.get(i);
            C.add(temp);
        }
        return C;
    }
    public ArrayList<String> Giao_Hai_Tap_Hop(ArrayList<String> A, ArrayList<String> B){
        ArrayList<String> C = new ArrayList<>();
        for (String s : A)
            if (B.contains(s)) {
                String temp = s;
                C.add(temp);
            }
        return C;
    }
    public ArrayList<String> Bu_Hai_Tap_Hop(ArrayList<String> A, ArrayList<String> B){
        ArrayList<String> C = new ArrayList<>();
        for (String s : A) {
            if (B.contains(s) == false) {
                String temp = s;
                C.add(temp);
            }
        }
        return C;
    }
}
