/*class LowBalException extends Exception{
    LowBalException(String msg){
        super(msg);
    }
}
    
class Account{
    public void withdrawl(int amount) throws LowBalException{
        int acc_bal = 50000;
        if(acc_bal > amount){
        System.out.println("Go and Enjoy");
    }                                            //throws handling
    else{
        throw new LowBalException("Go and learn");
    }
}
    public static void main(String[] args) throws LowBalException{
        new Account().withdrawl(4500);
    }
}*/


class LowBalException extends Exception{
    LowBalException(String msg){
        super(msg);
    }
}
    
class Account{
    public void withdrawl(int amount) {           //try and catch handling
        int acc_bal = 50000;
        try{
        if(acc_bal > amount){
        System.out.println("Go and Enjoy");
    }

    else{
        throw new LowBalException("Go and learn");
    }
}
catch(LowBalException e){
    System.out.println(e.getMessage());
}
    }
    public static void main(String[] args) {
        new Account().withdrawl(4500);
    }
}