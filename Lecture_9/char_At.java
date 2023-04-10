public class char_At{
    public static void print_ch(String name){
        for(int i =0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String name ="Sahil_bhardwaj";
        System.out.println(name.charAt(1));
        print_ch(name);
    }
}
