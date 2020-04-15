package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        Bai1 b1 = new Bai1();
        while(true ){
            System.out.println("Insert 1 to add student");
            System.out.println("Insert 2 to delete student");
            System.out.println("Insert 3 to update student");
            System.out.println("Insert 4 to search student");
            System.out.println("Insert 5 to show student");
            String line  = sc.nextLine();
            switch (line){
                case "1" :{
                    System.out.println("Insert ID");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insert Name");
                    String name= sc.nextLine();
                    Student st = new Student(id, name);
                    b1.addStudent(st);
                    break;
                }
                case "2" :{
                    System.out.println("Insert ID of student to delete");
                    int id = sc.nextInt();
                    b1.deleteStudent(students,id);
                    break;
                }
                case"3":{
                    System.out.println("Insert ID of student to update");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insert Name you wanna change ");
                    String namechange = sc.nextLine();
                    b1.updateStudent(id,namechange );
                    break;
                }
                case"4" :{
                    System.out.println("Insert ID of student you wanna search");
                    int id = sc.nextInt();
                    b1.searchStudentByID(id);
                    break;
                }
                case "5":{
                    b1.showStudent();
                    break;
                }
                default:

                    continue;

            }
        }


    }
}
