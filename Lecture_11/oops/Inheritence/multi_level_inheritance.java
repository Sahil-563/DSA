public class multi_level_inheritance{
    public static void main(String args[]){
        dog tom = new dog();
        tom.breed="Husky";
        tom.eat();
        System.out.println(tom.breed);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void sleep(){
        System.out.println("Sleeps");
    }
}
class Mamal extends Animal{
    String legs;
}
class dog extends Mamal{
    String breed;
}
