public class p3 {
    public static int printlen(String str){
        if(str.length()==0){
            return 0;
        }
        return printlen(str.substring(1))+1;
    }
    public static void main(String args[]){
        String str = "Sahil";
        System.out.print(printlen(str));
    }   
}
