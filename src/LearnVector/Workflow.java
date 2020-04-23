package LearnVector;

import java.util.List;
import java.sql.*;

public interface Workflow {
    void getAllStudentInDatabase(Connection conn) throws SQLException, ClassNotFoundException;

    List<Student> searchStudentByName(String name) throws SQLException, ClassNotFoundException;

    Student getStudent(int id);

    void addStudent(Student st);

    void updateStudent(Student st);

    void deleteStudent(int id);

}
