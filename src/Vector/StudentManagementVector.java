package Vector;

import java.sql.*;
import java.util.Vector;

public abstract class StudentManagementVector implements  Workflow{
    public Vector<ArrayList.Student> vec = new Vector<ArrayList.Student>();

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/testconnection?serverTimezone=UTC"
                , "root", "root");
    }
    public static ResultSet getResultSet(PreparedStatement ps) throws SQLException {
        return ps.executeQuery();
    }

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        return conn.prepareStatement(sql);
    }
    public  Vector<Student> getAllStudentInDatabase(Connection conn) throws SQLException {
        Vector<Student> vec = new Vector<Student>();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT  *from student");
        while (rs.next()){
            Student st = new Student (rs.getInt("id"),rs.getString("name"));
            vec.add(st);
        }
        return vec;
    }
   /* public void showStudent() {
        for (Student st : vec)
            System.out.println(st.toString());
    }
    public Vector<Student> searchStudentByName(String name) throws SQLException, ClassNotFoundException{
        Vector<Student> vecSearch = new Vector<Student>();

    }
    public Student getStudent(int id){
        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i).getId() == id) {
                return vec.get(i);
            }
        }
        return null;
    }
*/

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentManagementVector a = new StudentManagementVector() {
            @Override
            public Vector<Student> searchStudentByName(String name) {
                return null;
            }

            @Override
            public ArrayList.Student getStudent(int id) {
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
        };
        Connection conn = getConnection();
        a.getAllStudentInDatabase(conn);
        a.showStudent();
    }
}
