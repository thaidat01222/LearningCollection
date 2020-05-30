package LearnBasic;
import java.util.Scanner;
public class Bai7 {
    public int Fibo_thu_n(int n){
        int a[] = new int[n] ;
        a[0] =1;
        a[1] =1;
        for(int i=2; i<n ; i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n-1];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n");
        int n = scanner.nextInt();
        Bai7 bai7 = new Bai7();
        int fibo = bai7.Fibo_thu_n(n);
        System.out.println("so fibo thu "+n+ " : "+fibo);
    }
}
