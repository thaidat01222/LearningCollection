package LearnLinkedList;

import java.util.LinkedList;

public class RealLinkedList {
    private LinkedList<Student> linkedList;
    public RealLinkedList(){
        this.linkedList = new LinkedList<Student>();
    }
    public void addStudent(Student student){
        linkedList.add(student);
    }
    public void removeStudent(Student student){
        linkedList.remove(student);
    }
    public void showList(){
        if(!linkedList.isEmpty()) {
            for(Student student : linkedList){
                System.out.println(student.toString());
            }
        }
        else System.out.println("List empty");;
    }
    public Student searchStudent(String id){
        for(int i= 0; i<linkedList.size(); i++){
            if(linkedList.get(i).getId() == id) {
                return linkedList.get(i);
            }
        }

        return null;
    }
    public void updateStudent(String id, String name){
        Student tempt =  searchStudent(id);
        if(tempt != null){
            tempt.setName(name);
        }
        else System.out.println("null");
    }
}
class  main{
    public static void main(String[] args) {
        RealLinkedList linkedList = new RealLinkedList();
        Student student1 = new Student("1", "Dat");
        Student student2 = new Student("2", "Quang");
        Student student3 = new Student("3", "Nhat");
        Student student4 = new Student("4", "Duc");
        Student student5 = new Student("5", "Hien");

        linkedList.addStudent(student1);
        linkedList.addStudent(student2);
        linkedList.addStudent(student3);
        linkedList.addStudent(student4);
        linkedList.addStudent(student5);
/*
        linkedList.showList();

        linkedList.removeStudent(student1);
        linkedList.showList();*/

        Student studentn = linkedList.searchStudent("5");
        System.out.println(studentn.toString());

        linkedList.updateStudent("2", "AAAAAAAA");
        linkedList.showList();
    }
}
