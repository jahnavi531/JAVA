/*import java.io.PrintWriter;

class Test{
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("abc.txt");  //FileNotFoundException
    }
}*/

/*import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Test{
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("abc.txt") ;

        }                                                         //try and catch exceptional handling
        catch(FileNotFoundException fnfEX){
            fnfEX.printStackTrace();

        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
} */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Test{                                  //throws exceptional handling
    //its means ignore in method level
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
    }
}