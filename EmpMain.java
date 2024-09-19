package anudipday2;
 class Employee {

    public String getRole() {
        return "Employee";
    }
}
class Manager extends Employee {

    @Override
    public String getRole() {
        return "Manager";
    }
}
class Developer extends Employee {

    @Override
    public String getRole() {
        return "Developer";
    }
}
public class EmpMain {
    public static void main(String[] args) {
        Employee employee1 = new Manager();

        Employee employee2 = new Developer();

        System.out.println("Employee 1 Role: " + employee1.getRole());
        System.out.println("Employee 2 Role: " + employee2.getRole());
    }
}
