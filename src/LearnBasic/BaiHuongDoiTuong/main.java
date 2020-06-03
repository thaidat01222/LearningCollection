package LearnBasic.BaiHuongDoiTuong;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Hinh> list = new ArrayList<>();
        list.add(new HinhChuNhat(3,4));
        list.add(new HinhTron(3));
        list.add(new HinhVuong(3));
        for(Hinh h : list){
            System.out.println(h);
        }

    }


}
