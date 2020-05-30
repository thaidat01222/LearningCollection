package LearnBasic;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap num");
        int n = scanner.nextInt();Bai3 bai3 = new Bai3();
        int sum = bai3.Tong_Chu_So(n);
        System.out.println("tong cac chu so cua "+n+" la : " +sum);

    }
    public int Tong_Chu_So(int num){
        int sum = 0;
        while(num>0){
            sum+=(num%10);
            num = num/10;
        }
        return sum;
    }
}
