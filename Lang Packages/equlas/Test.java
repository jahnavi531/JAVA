class A{}
class B extends A{}
public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.equals(b));
    }
    
}
