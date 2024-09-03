class Account{
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    static double min_bal=2000;
    static String branch_Name="SBI";
    public static void main(String[] args){
        Account a1=new Account();
        Account a2=new Account();
        Account a3=new Account();

        System.out.println(a1.acc_Id);
        System.out.println(a1.acc_Name);
        

    }
}