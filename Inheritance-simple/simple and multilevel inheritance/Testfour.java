interface p1{
    void m1();                                //public abstarct is automatic take interafce

}
interface p2{
  void m2();
} 
class child implements p1,p2{
    public void m1(){
        System.out.println("child - m1");
    }
    public void m2(){
        System.out.println("child- m2");
    }

}  
public class Testfour{
    public static void main(String[] args) {
        child c1=new child();
        c1.m1();
        c1.m2();
    }

}







/*class p2 extends object{}
class child extends p1,p2{}         does not support multiple inheritance so we slove by using interface
public class Testfour{}*/                