package LearnBasic;
import java.util.ArrayList;
public class Bai15 {
    public ArrayList<Integer> So_Xuat_Hien_2Lan(ArrayList<Integer> list){
        ArrayList<Integer> result  = new ArrayList<>();
        ArrayList<Integer> newList = list;

        for(int i = 0 ; i<list.size()-1; i++){
            int k = 0;
            for(int j = i; j<list.size();j++){
                if(newList.get(i) == list.get(j)){
                    k++;
                }
            }
            if(k==1){
                result.add(newList.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(9);
        Bai15 bai15 = new Bai15();
        ArrayList<Integer> resultList = bai15.So_Xuat_Hien_2Lan(list);
        System.out.println("cac phan tu xuat hien 2 lan la :"+resultList );
    }
}
