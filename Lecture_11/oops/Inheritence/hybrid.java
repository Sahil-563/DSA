import javax.sql.rowset.spi.SyncResolver;

public class hybrid{
    public static void main(String args[]){
        Tuna tuna = new Tuna();
        tuna.breed();
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
 class Tuna extends Fish{
    void breed(){
        System.out.println("Breed name is Tuna");
    }
 }
 class Shark extends Fish{
    void breed(){
        System.out.println("Breed name is Shark");
    }
}
