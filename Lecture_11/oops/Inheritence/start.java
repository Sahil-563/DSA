public class start{
    public static void main(String args[]){
        Fish nimbo = new Fish();
        nimbo.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}
//Single level inheritance
class Fish extends Animal{   //FISH inherits the properties of animals
    void swims(){
        System.out.println("Fish swims");
    }
}