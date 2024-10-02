class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
}
class Manager extends Employee{
    String dept;
    Manager(String name, String dept){
        super(name);
        this.dept=dept;
    }
}
public class TestTwo{
    public static void main(String[] args) {
        Manager m1=new Manager("Rajni", "Movies");
            System.out.println(m1.name + ":"+m1.dept);
    }
}