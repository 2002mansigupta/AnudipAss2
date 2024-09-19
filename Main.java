package anudipday2;

class Person{
    private String name;
    private int age ;
    private String address;
    public void set_name(String n){
        this.name=n;
    }
    public String get_name(){
        return name;
    }
    public void set_age(int a){
        if(age>=0){
            this.age=a;
        }
        else{
            System.out.println("age must be greater then 0 ");
        }
    }
    public int get_age(){
        return age;
    }
    public void set_address(String add){
       address=add;
    }
    public String get_address(){
        return address;
    }

}
public class Main {
    public static void main(String[] args) {
        Person p=new Person();
        p.set_name("mansi");
        p.set_address("hon-1308 sec 7/d");
       p.set_age(22);
        System.out.println(p.get_name());
        System.out.println(p.get_age());
        System.out.println(p.get_address());

    }
}
