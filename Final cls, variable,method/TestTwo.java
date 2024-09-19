class parent{
    public final void m1(){
         System.out.println("parent class m1 method");

    }
}
class child extends parent{                           //method is declared as final overridding is not possible
    public void m1(){
           System.out.println("child class m1 method");
    }
}