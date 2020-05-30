package LearnBasic;
import  java.util.Scanner;
public class Bai8 {
    public boolean So_nghich_doc(int num){
        int n=0;
        int num1=num;
        while(num1>0){
            n = n*10 + num1%10;
            num1= num1/10;
        }
        if(n == num){
            return true;
        }
        return  false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int num = scanner.nextInt();
        Bai8 bai8 = new Bai8();
        boolean result = bai8.So_nghich_doc(num);
        if(result){
            System.out.println(num+ " la so nghich doc ");
        }
        else System.out.println(num+ " ko phai so nghich doc");

    }
}
