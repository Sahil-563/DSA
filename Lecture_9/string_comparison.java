
public class string_comparison{
    public static void main(String args[]){
        String str1 = "Sahil";
        String str2 = "Sahil";
        String str3 = new String("Sahil");
        if(str1==str2){
            System.out.println("Same");
        }
        else{
            System.out.println("NOt same");
        }
        if(str1.equals(str3)){
            System.out.println("Same");
        }
        else{
            System.out.println("NOT same");
        }

    }
}