//print all the subsequences of a string

public class p4 {
    public static void subsequences(String str,String new_Str,int indx){
        if(indx == str.length()){
            System.out.println(new_Str);
            return;
        }
        char curr_Char = str.charAt(indx);
        subsequences(str, new_Str+curr_Char, indx+1);
        subsequences(str, new_Str, indx+1);


    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str, "", 0);
    }
    
}
