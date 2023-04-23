public class Function_overrriding{
    public static void main(String args[]){
        deer d= new deer();
        d.eat();
    }
}
public class animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("Eats grass");
    }

}
