//Multiple inheritence using java
public class interfaces_2{
    public static void main(String args[]){
        beer b= new beer();
        System.out.println(b.eats);
        System.out.println(b.eats1);
    }
}
interface herbivorous{
    String eats= "It eats grass";
}
interface carnivorous{
    String eats1 = "It eats flesh";
}
class beer implements herbivorous,carnivorous{

}
