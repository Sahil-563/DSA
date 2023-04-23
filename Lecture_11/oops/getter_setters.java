public class getters_setters{
    public static void main(String args[]){
        Bankdetails user_1=new Bankdetails();
        user_1.set_name("Sahil");
        System.out.println(user_1.get_name());
        System.out.println(user_1.get_password());
    }
}
public class Bankdetails{
    private String name;
    private String password;
    void set_name(String name){
        this.name= name;
    }
    void set_password(String password){
        this.password = password;
    }
    String get_password(){
        return this.password;
    }
    String get_name(){
        return this.name;
    }
}