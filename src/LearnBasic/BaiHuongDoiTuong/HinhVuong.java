package LearnBasic.BaiHuongDoiTuong;

public class HinhVuong extends Hinh {
    public int canh;
    public HinhVuong(int canh){
        this.canh = canh;
    }
    public double dientich(){
        return canh*canh;
    }
}
