package LearnBasic.BaiHuongDoiTuong;

public class HinhTron extends Hinh {
    public double Ban_Kinh;
    public HinhTron(double ban_Kinh){
        this.Ban_Kinh = ban_Kinh;
    }
    public double dientich(){
        return 3.14*Ban_Kinh*Ban_Kinh;
    }
}
