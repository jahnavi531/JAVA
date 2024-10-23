
/*public class Test {
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0);                 //arthimetic exception
        System.out.println(10/5);
    }
    
    
}*/

class Test{
    public static void main(String[] args) {
        System.out.println(10/2);
        try{
            System.out.println(10/0);
        }
        catch(Exception e ){
            System.out.println(10/1);

        }
        System.out.println(10/5);

    }
}
