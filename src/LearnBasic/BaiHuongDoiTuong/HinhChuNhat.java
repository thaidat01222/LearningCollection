package LearnBasic.BaiHuongDoiTuong;

public class HinhChuNhat extends Hinh {
    public int chieu_dai, chieu_rong;
    public HinhChuNhat(int chieu_dai, int chieu_rong){
        this.chieu_dai = chieu_dai;
        this.chieu_rong= chieu_rong;
    }
    public double dientich(){
        return  chieu_rong*chieu_dai;
    }
}
