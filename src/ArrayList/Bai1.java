package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Bai1 {
    public ArrayList<Student> students ;
    public Bai1(){
        this.students = new ArrayList<Student>();
    }
    public void addStudent(Student st) {
        students.add(st);
    }
    public void deleteDocument(int id) {
        students.remove(id);
    }
    public void updateStudent(int id, String nameChange){

        for(Student st : students){
           if(st.equals(id)){
               st.setName(nameChange);
           }
       }
    }
    public List<Student> searchStudentByID(String id) {
        return students.stream().filter(student -> student.getId()
                .equals(id)).findFirst().orElse(null);
    }
    public void showStudent(){
        students.forEach(student -> System.out.println(student.toString()));
    }

}
