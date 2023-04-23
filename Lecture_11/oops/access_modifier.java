public class access_modifier{
    public static void main(String args[]){
        Bankdetails user_1=new Bankdetails();
        user_1.name="Sahil";
        user_1.set_password("abc");
        System.out.println(user_1.name);
        System.out.println(user_1.password);  //It will throw error since passsword is private 

    }
}
public class Bankdetails{
    public String name;
    private String password;
    public void set_password(String pwd){
        password = pwd;
    }
}