package ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Bai2 {
    public Student[] students;
    public Bai2(){
        this.students = new Student[10];
    }

    public void addStudent(Student student, int vitri ){
        students[vitri] = student;

    }
    public  void updateStudent(int id, String nameChange) {
        Student student = new Student(id, nameChange);
        for(int i = 0 ; i < students.length ; i++) {
            if(students[i]!=null){
                if(students[i].getId() == id){
                    students[i] = student;
                    return;
                }
            }
        }
    }
    public Student searchStudentByID(int id){
        for(int i = 0; i<students.length; i++){
            if(students[i]!=null) {
                if (students[i].getId() == id) {
                    return this.students[i];
                }
            }
        }
   return null;
    }
    public void deleteStudentByID(int id){
        for(int i = 0 ; i<students.length; i++){
            if(students[i]!= null){
                if(students[i].getId() == id){
                    students[i] = null;
                }
            }
        }
    }
    public void showStudent(){

        for (int index = 0 ; index <students.length; index++)
            System.out.println(students[index]);
    }
    public static void main(String[] args){
        Student[] students = new Student[5];

        Bai2 b2 = new Bai2();
        Student  student0 =   new Student(0,"Name0");
        Student  student1 =   new Student(1,"Name");
        Student  student2 =   new Student(2,"Name1");
        Student  student3 =   new Student(3,"Name2");
        Student  student4 =   new Student(4,"Name3");
        Student  student5 =   new Student(5,"Name4");

        b2.addStudent(student1, 1);
        b2.addStudent(student2, 2);
        b2.addStudent(student3, 3);
        b2.addStudent(student4, 4);
        b2.addStudent(student5, 5);

        b2.showStudent();
        System.out.println("");

        b2.updateStudent(1, "Dat");
        b2.showStudent();
        System.out.println("");

        Student st = b2.searchStudentByID(3);
        System.out.println(st.toString());
        System.out.println("");

        b2.deleteStudentByID(3);
        b2.showStudent();
    }
}
