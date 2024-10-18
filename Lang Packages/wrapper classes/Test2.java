public class Test2 {
    public static void main(String[] args) {
        int a=10;
        Integer i = a;             //autoboxing 
        Integer i1 = Integer.valueOf(a);       //primitive to object

        String s1 = i.toString();          //object to string
        int b = Integer.parseInt(s1);      //string to primitive
        int c = i.intValue();             //object to primitive

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s1);
        System.out.println(i);

    }
    
}
