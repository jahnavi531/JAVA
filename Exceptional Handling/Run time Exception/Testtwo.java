
/*public class Testtwo {
    public static void main(String[] args) {
    //String ename = "Rahul";                 //    5
        String ename = null;
        System.out.println(ename.length());          //NullPointerException
        System.out.println("GM");       //Gm
    }
    
}*/


public class Testtwo {
    public static void main(String[] args) {
        String ename = null;
        try{
        System.out.println(ename.length());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("GM");
    }
}   

