public class substring1{
    public static String subString(String name,int si,int ei){
        String substr ="";
        for(int i=0;i<ei;i++){
            substr+=name.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String name ="Sahil";
        System.out.println(subString(name, 0, 5));
        //or we can inbuilt function that is .substirng(si,ei)
        System.out.println(name.substring(0,5));
    }
}