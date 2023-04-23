public class start{
    public static void main(String args[]){
        Horse h = new Horse();
        h.walk();
        Human h1 = new Human();
        h1.walk();

    }
}
abstract class Animal{
    Animal(){
        System.out.println("Animal comstructor is called..");
    }
    abstract void walk();  //We created an abstract function 
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse comstructor is called..");
    }
    void walk(){
        System.out.println("hourse walks on four legs"); //We used abstract function whose definition is different
    }
}
class Human extends Horse{
    Human(){
        System.out.println("Human comstructor is called..");
    }
    void walk(){
        System.out.println("human walks on two legs"); //Here we again used abstract function but the definition is again different
    }
}