public class A {
    public static void main(String[] args) {
        String ename1= new String("Rahul");
        StringBuffer ename2 = new StringBuffer("Rahul");
        System.out.println(ename1.equals("Rahul"));                 //content comparsion so true

       // System.out.println(ename1==ename2);   relation required                                

    }
}    
//output is true