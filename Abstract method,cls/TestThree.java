abstract class Account{
     public void open_Acc(){
        System.out.println("Account opened Sucessfulluy");
     }
     public abstract int get_bal();
}
class SA extends Account{
    public int get_bal(){
        return 100;
    }
public static void main(String[] args){
    SA obj = new SA();
    obj.open_Acc();
    int bal = obj.get_bal();
    System.out.println(bal);
}
}