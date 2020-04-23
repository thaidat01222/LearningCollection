package LearnArrayList;
import java.util.Vector;
public class Bai3 {
    public Vector<Student> vec ;
    public Bai3(){
        this.vec = new Vector<Student>();
    }
    public void addStudent(Student student){
        this.vec.add(student);
    }
    public void updateStudent(int id, String nameChange){
        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i).getId() == id){
                this.vec.get(i).setName(nameChange);
            }
        }
    }
    public Student searchStudentByID(int id) {
        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i).getId() == id) {
                return vec.get(i);
            }
        }
        return null;
    }
    public void deleteStudentByID(int id){
        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i).getId() == id) {
                this.vec.remove(i);
                return;
            }
        }
    }
    public void showStudent() {
        for (Student st : vec)
            System.out.println(st.toString());
    }
    public void testVec(){
        vec.hashCode();

    }
    public static void main(String[] args){
        Bai3 b3 = new Bai3();
        Student student1 = new Student(1, "dat");
        Student student2 = new Student(2, "Qaung");
        Student student3 = new Student(3,"Nhat");

        b3.addStudent(student1);
        b3.addStudent(student2);
        b3.addStudent(student3);

        b3.showStudent();

        student3 =  b3.searchStudentByID(3);
        System.out.println(student3.toString());

        b3.deleteStudentByID(3);
        b3.showStudent();

        b3.updateStudent(2, "quang");
        b3.showStudent();

        b3.testVec();
        b3.showStudent();
    }

    

}
