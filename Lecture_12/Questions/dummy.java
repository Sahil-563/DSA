public class dummy {
    public static void print_sub_sequences(String str){
        for(int i = 0;i<=str.length();i++){
            for(int j = i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String args[]){
        String str = "abc";
        print_sub_sequences(str);

    }
    
}
