 class parent{
    public void m1(){
        System.out.println("parent - m1");
    }
    public void m2(){
        System.out.println("parent cls-m2");
    }
 }
 class child extends parent{
    public void m3(){
        System.out.println("child - m3");
    }
 }
 class TestThree{
public static void main(String[] args) {
    parent p1=new parent();
    child c1=new child();
    parent p2= new child();
    p1.m1();
    c1.m1();
    p2.m1();
}
    

 }

//child obj = new parent()  its not possible bcoz child not ref to parent