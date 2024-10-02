   class test{
    public static void main(String[] args) {
       //new Bank(); 
    //new Account("Rahul","rg@gmail.com","Wayanad");
    SA sa1=new SA(101,"Rahul",5000.00,"Rahul@gmail.com");

    sa1.setMin_Bal(600);

    sa1.cal_Bal();
    
    CA ca1=new CA(102,"Priyanka", 700000,  "priyanka@gmail.com");
    ca1.setMin_Bal(25000);
   

    ca1.cal_Bal();
    

    }
}