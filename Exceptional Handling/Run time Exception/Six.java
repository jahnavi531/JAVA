class Test{
public static void main(String[] args) {
    m1();
}
public static void m1(){
   m2();
}  
public static void m2(){                        //stackovereflow exception
    m3();
 }   
 public static void m3(){
    m1();
 }    
}
