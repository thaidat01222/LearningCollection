package LearnBasic;
import  java.util.Scanner;
public class Bai1 {
    public int Ucln(int a, int b){
        int ucln = 0;
        if(b<a){
            for(int i= 2 ; i <= a/2; i++){
                if((a % i == 0 ) && (b % i == 0)) ucln = i;
            }
        }
        else {
            for(int i= 2 ; i <= b/2; i++){
                if((a % i == 0 ) && (b % i == 0)) ucln = i;
            }
        }
        return  ucln;
    }
    public  int Bcnn(int a, int b){
        int bcnn = (a*b)/Ucln(a,b);
        return bcnn;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Bai1 bai1 = new Bai1();
        System.out.println("Nhap A:");
        int a = scanner.nextInt();
        System.out.println("Nhap B:");
        int b = scanner.nextInt();
        int ucln = bai1.Ucln(a,b);
        int bcnn = bai1.Bcnn(a,b);
        System.out.println("UCLN cua a,b : "+ucln);
        System.out.println("BCNN cua a,b : "+bcnn);
    }

}
