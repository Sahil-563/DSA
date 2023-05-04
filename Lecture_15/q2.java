public class q2 {
    public static void printSubSet(String newStr,int indx,String orgStr){
        if(indx == orgStr.length()){
            System.out.println(newStr);
            return;
        }
        char curChar = orgStr.charAt(indx);  //current character
        printSubSet(newStr+curChar, indx+1, orgStr);//choice yes of current character
        printSubSet(newStr, indx+1, orgStr);//Choice no of current character
    }
    public static void main(String args[]){
        printSubSet("",0,"abc");

    }
    
}
