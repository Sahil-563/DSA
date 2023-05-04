public class q3 {
    public static void findPermutation(String orgStr,String ans){
        if(orgStr.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<orgStr.length();i++){
            char curChar = orgStr.charAt(i);
            String newStr = orgStr.substring(0, i)+orgStr.substring(i+1);
            findPermutation(newStr, ans+curChar);
        }

    }
    public static void main(String args[]){
        String orgStr = "abc";
        findPermutation(orgStr,"");
    }
    
}
