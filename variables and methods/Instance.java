 class Test{
    int a=100;        //instance variable or object varaible
    static int b=200;     //static or class level variable
     public static void main(String[] args){
        int c=300;    //local varaible
        Test t1=new Test();            //object created to access instance varaible
        System.out.println(t1.a);
         System.out.println(b);       //accessed directly
         System.out.println(t1.b);          //accessed with object
         System.out.println(Test.b);          //accessed with class name
        
        

     }
}