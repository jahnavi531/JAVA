
public class Account {
    int acc_Id;
    String acc_Name;
    double acc_bal;
    public Account(int id, String name, double amount ){
        this.acc_Id = id;
        this.acc_Name = name;
        this.acc_bal = amount;
        
    }
    public void open_Account(){
        System.out.println("Account opened");
    }
    public boolean deposit_Amount(double amount){
        this.acc_bal = this.acc_bal+amount;
        return true;
    }
    public double get_bal(){
        return this.acc_bal;
    }
    public static void main(String[] args) {
        Account a1 = new Account(101, "Jaanu", 78000.80);
        a1.deposit_Amount(150.00);
        a1.deposit_Amount(50.00);
        System.out.println(a1.get_bal());

        Account a2 = new Account(102, "kanna", 23400.89);
        a2.deposit_Amount(13400.00);
        System.out.println(a2.get_bal());
    }
}
