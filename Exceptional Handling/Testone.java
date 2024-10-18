
/*public class Testone {
    public static void main(String[] args) {
        int[] eids={101,102,103,104};
        System.out.println(eids[0]);
        System.out.println(eids[1]);
        System.out.println(eids[10]);      //.ArrayIndexOutOfBoundsException:
        System.out.println(eids[3]);
    }
    
}*/

public class Testone{
    public static void main(String[] args) {
        int[] eids={101,102,103,104};
        System.out.println(eids[0]);            //101
        try{
            System.out.println(eids[10]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(eids[3]);      // 104
    }
}
