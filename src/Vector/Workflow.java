package Vector;
import java.util.List;
import java.sql.*;
public interface Workflow {
        List<Student> getAllStudentInDatabase(Connection conn) throws SQLException, ClassNotFoundException;
        List<Student> searchStudentByName(String name) throws SQLException, ClassNotFoundException;
        ArrayList.Student getStudent(int id);
        void addStudent(Student st);
        void updateStudent(Student st);
        void deleteStudent(int id);

}
