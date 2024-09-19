package anudipday2;

class Student{
    private String name;
    private char grade;
    /*public  Student(String n, char g){
        this.name=n;
        this.grade=g;
    }*/
    public String get_name(){
        return name;
    }
    public void set_name(String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty.");
        }
    }

    public void set_grade(int marks,char g){
        if(marks>=0 && marks<=100){
            this.grade=g;
        }
        else{
            System.out.println(" marks should be between 0 to 100");
        }
    }
    public char get_grade(){
        return grade;
    }
}
public class StudentMain {
    public static void main(String[] args) {
     Student s=new Student();
     s.set_name("");
        System.out.println(s.get_name());
        s.set_grade(-23,'B');
        System.out.println(s.get_grade());
    }
}
