package LearnBasic.BaiHuongDoiTuong;

import java.util.ArrayList;

public abstract class Hinh {
    ArrayList<Hinh> list = new ArrayList<>();
   public abstract double dientich();
   public String toString(){
       return "Dien tich : " + dientich();
    }
    public void addHinh(Hinh hinh){
       list.add(hinh);
    }
}
