public class B {
    public String toString(){
        return "Hello Everyone";
    }
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b);
        System.out.println(b.toString());
    }
    
}
//we are overriding object class toString method
//purpose : to get meaningful value
