package LearnBasic;

import java.util.Scanner;

public class Bai18 {

    public String Standardize_The_String(String string){
        String newString = string.trim();
        int n = 0;
        while (n<newString.length()){
            newString = newString.replace("  ", " ");
            n++;
        }
        return newString;
    }
    public int Count_the_words(String string) {
        int count = 0;
        Bai18 bai18 = new Bai18() ;
        String newString = bai18.Standardize_The_String(string);
        if (newString.isEmpty()) {
            return 0;
        } else {
            for (int i = 1; i < newString.length(); i++) {
                if((newString.charAt(i) == ' ')&&(newString.charAt(i+1) != ' ')) {
                    count++;
                }
            }
        }
        return count+1 ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ma ban mong muon");
        String string = scanner.nextLine();
        Bai18 bai18 = new Bai18();
        String newString = bai18.Standardize_The_String(string);
        System.out.println("Chuoi sau khi duoc chuan hoa suong suong : " +newString);
        int count = bai18.Count_the_words(string);
        System.out.println("so chu cua chuoi la : " + count);
    }
}

