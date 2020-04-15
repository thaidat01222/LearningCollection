package ArrayList;

import java.util.ArrayList;

public class StudentManagementArrayList {
    public ArrayList<Student> students;

    public StudentManagementArrayList(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student st) {
        students.add(st);
    }

    public void updateStudent(int id, String nameChange) {
       /* for (int i = 0; i < this.students.size(); i++) {
            Student st = students.get(i);
            if (st.getId() == id) {
                st.setName(nameChange);
            }
        }*/
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(nameChange);
            }
        }
    }

    public Student searchStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Student> searchStudentByName(String name) {
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getName().startsWith(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
    }

    public void showStudents() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public void showStudents(ArrayList<Student> sts) {
        for (Student s : sts) {
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "quang1"));
        students.add(new Student(2, "dat2"));
        students.add(new Student(3, "quang3"));
        students.add(new Student(4, "nhat4"));
        students.add(new Student(5, "thuy5"));
        students.add(new Student(6, "anh6"));
        students.add(new Student(7, "quang7"));
        students.add(new Student(8, "quang8"));

        StudentManagementArrayList manager = new StudentManagementArrayList(students);
        System.out.println("----------ADD-----------");
        manager.addStudent(new Student(9, "abc"));
        manager.showStudents();
        System.out.println("----------UPDATE-----------");
        manager.updateStudent(9, "new_name");
        manager.showStudents();
        System.out.println("----------DELETE-----------");
        manager.deleteStudent(8);
        manager.showStudents();
        System.out.println("----------SEARCH NAME-----------");
        ArrayList<Student> searchResult = manager.searchStudentByName("quang");
        manager.showStudents(searchResult);
        System.out.println("----------SEARCH ID-----------");
        Student searchResultId = manager.searchStudentById(1);
        System.out.println(searchResultId);
    }
}
