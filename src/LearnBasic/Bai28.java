package LearnBasic;
import  java.util.Scanner;
import  java.lang.Character;
public class Bai28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nhap chuoi");
        String string = scanner.nextLine();
        Bai28 bai28 = new Bai28();
        String string1 = bai28.Standardized_String(string);
        System.out.println(string1);
        }

    public String Standardized_String(String string) {
        Bai18 bai18 = new Bai18();
        String newString = bai18.Standardize_The_String(string);
        String temp[] = newString.split(" ");
        String temp1[] = new String[temp.length];
        newString = "";
        for (int i = 0; i < temp.length; i++) {
            temp1[i] = "";
            char k = temp[i].charAt(0);
            k = Character.toUpperCase(k);
            temp1[i] += k;
            for(int j = 1; j<temp[i].length(); j++){
                char l = temp[i].charAt(j);
                l = Character.toLowerCase(l);
                temp1[i] += l;
            }
            newString += " " + temp1[i];
        }
        newString = newString.trim();
    return newString;
    }
}
