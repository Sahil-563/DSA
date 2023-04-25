public class p6 {
    public static void reverse_str(String str,int indx){
        if(indx == str.length()){
            return;
        }
        reverse_str(str, indx+1);
        System.out.print(str.charAt(indx));


    }
    public static void main(String args[]){
        String str = "Sahil";
        reverse_str(str, 0);
    }
    
}
