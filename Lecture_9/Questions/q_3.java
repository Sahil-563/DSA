import javax.swing.plaf.FileChooserUI;

public class q3{
    public static String largest_string_lexicographically(String Fruits[]){
        String largest;
        largest = Fruits[0];
        for(int i=1;i<Fruits.length;i++){
            if(largest.compareTo(Fruits[i])<0){
                largest+=Fruits[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        String Fruits[]={"mango","apple","banana"};
        System.out.println(largest_string_lexicographically(Fruits));

    }
}