public class q3{
    public static void largest_str(String str1,String str2,String str3){
        int l1 =str1.length();
        int l2 = str2.length();
        int l3 = str3.length();
        if(l1>l2&&l1>l3){
            System.out.println("Largest string is: "+str1);
        }
        else if(l2>l3&&l2>l1){
            System.out.println("Largest string is: "+str2);
        }
        else{
            System.out.println("Largest string is: "+str3);
        }

    }
    public static void main(String args[]){
        String str1 ="Apple";
        String str2 ="Mango";
        String str3 ="Banana";
        largest_str(str1, str2, str3);
    }
}