class Grandparents{
    public void m1(){
        System.out.println("GP - m1");
    }
    public void m2(){
        System.out.println("GP - m2");
    }
}
class parent extends Grandparents{
    public void m3(){
        System.out.println("parent - m3");
    }
}
class Child extends parent{
    public void m4(){
        System.out.println("child - m4");
    }
}

public class TestTwo {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
    }
}

