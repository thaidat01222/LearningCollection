package ArrayList;

import java.util.ArrayList;

public class Bai1 {
    public ArrayList<Student> students;

    public Bai1() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student st) {
        students.add(st);
    }

    public void deleteStudent(ArrayList<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                this.students.remove(i);
                return;
            }
        }
    }

    public void updateStudent(int id, String nameChange) {
        for (Student st : students) {
            if (st.getId() == id) {

            }
        }

    }

    public void searchStudentByID(int id) {
        for (Student st : students) {
            if (st.getId() == id) {
                System.out.println(st.toString());
            }
        }

    }

    public void showStudent() {
        for (Student st : students)
            System.out.println(st.toString());
    }

}
