class parent{
    parent(){
        System.out.println("Parent class-Constructor");
    }
}
class child extends parent{                                   //complier will add super() by default if there is no arguments in parent class
    child(){
        System.out.println("Child class-Constructor");
    }
}
public class Test{
    public static void main(String[] args) {
        new child();
    }
}