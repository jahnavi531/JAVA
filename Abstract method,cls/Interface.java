interface Account{
    int get_bal();
    void close_Acc();
}
class SA implements Account{
    public static void main(String[] args){
        SA obj = new SA();
      int bal = obj.get_bal();
       System.out.println(bal);

        obj.close_Acc();
    }
    public int get_bal(){
        return 100;
    }                                                     //NON STATIC METHODS
    public void close_Acc(){
        System.out.println("Account closed sucessfully");
    }
}