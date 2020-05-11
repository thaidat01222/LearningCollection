package LearnLinkedList;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;
    private String id;
    public Student(String id , String name){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name " +getName() + " ID " +getId();
    }
}
