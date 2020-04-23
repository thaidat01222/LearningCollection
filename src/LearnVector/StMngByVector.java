package LearnVector;

import java.sql.*;
import java.util.List;
import java.util.Vector;

public class StMngByVector implements Workflow {
    private List<Student> students;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/testconnection?serverTimezone=UTC"
                , "root", "root");
    }

    public void getAllStudentInDatabase(Connection conn) throws SQLException {
        Vector<Student> vec = new Vector<>();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT  * from student");
        while (rs.next()) {
            Student st = new Student(rs.getInt("id"), rs.getString("name"));
            vec.add(st);
        }
        students = vec;
    }

    @Override
    public List<Student> searchStudentByName(String name) {
        List<Student> sts = new Vector<>();
        for (Student st : this.students) {
            if (st.getName().equals(name)) {
                sts.add(st);
            }
        }
        return sts;
    }

    @Override
    public Student getStudent(int id) {
        return null;
    }

    @Override
    public void addStudent(Student st) {

    }

    @Override
    public void updateStudent(Student st) {

    }

    @Override
    public void deleteStudent(int id) {

    }

    public static void main(String[] args) {
        Workflow wf = new StMngByVector();
        try {
            Connection connection = getConnection();
            wf.getAllStudentInDatabase(connection);
            List<Student> searchResult = wf.searchStudentByName("quang");
            //
        } catch (Exception e) {
            System.out.println("khong the ket noi toi database");

        }
    }
}
