//One base class and different derived class from the same base class
import javax.swing.plaf.synth.SynthOptionPaneUI;
public class hierarchial{
    public static void main(String args[]){
        Fish nimbo = new Fish();
        nimbo.swims();
        nimbo.eat();
        Bird sparrow = new Bird();
        sparrow.fly();
        sparrow.sleep();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats");
    }
    void sleep(){
        System.out.println("Sleeps");
    }
}
class Fish extends Animal{
    void swims(){
        System.out.println("Fish swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Birds fly");
    }
}