interface A{
     void m1();
}
interface B{
     void m2();
}
class Test implements A,B{
    public void m1(){
        System.out.println("Hello");
    }
    public void m2(){
         System.out.println("Good Morning");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.m1();
        t.m2();
    }

}

