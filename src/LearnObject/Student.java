package LearnObject;

public class Student {
    private int id;
    private String name;

    Student() {
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
       return id + " - "+ name;
    }

    @Override
    public int hashCode() {
        return id + name.length()*31;
    }
}
