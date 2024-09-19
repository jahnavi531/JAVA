abstract class A {
   public abstract void m1();           
}
class B extends A {
   public void m1(){
         System.out.println("Hello");
    }
}
    class Test{
    public static void main(String[] args){
        B b = new B();
        b.m1();
    }
}