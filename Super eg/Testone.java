class Parent{
    Parent(String fname,String mname){
        System.out.println("Father Name"+fname+"and Mother Name"+mname);
    }
}
class Child extends Parent{
    Child(String cname,String fatherName, String mname){
        super(fatherName,mname);
        System.out.println("Child Name"+cname);
    }
}

public class Testone {
    public static void main(String[] args) {
        new Child("Rahul","Rajeev-Gandhi","Sonia-Gandhi");
    }
}