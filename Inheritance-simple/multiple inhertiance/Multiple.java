interface DAOI{
    void login();
    void logout();
}
interface USI{
    void forgetpassword();
}
class DAOImpl implements DAOI,USI{
    public void login(){
        System.out.println("login sucess");
    }
    public void logout(){
        System.out.println("logout sucess");
    }
   public void forgetpassword(){
    System.out.println("forget password updated sucessfully");
   }
}
public class Multiple{
        public static void main(String[] args) {
            DAOImpl obj = new DAOImpl();
            obj.login();
            obj.logout();
            obj.forgetpassword();
        }
}