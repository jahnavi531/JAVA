class B{}
public class A {
    public static void main(String[] args) {
        B b = new B();
    String ename1 = "Rahul";
    String ename2 = new String("Rahul");
    String ename3 = "Rahul";
        System.out.println(ename1.equals(ename2));             //true
        System.out.println(ename1==ename2);                   //flase
        System.out.println(ename1.equals(ename3));            //true
        System.out.println(ename1==ename3);                   //true
        System.out.println(b.equals(ename1));                 //flase
      }
    
}
