public class q1{
    public static boolean is_palidrome(String name){
        int n=name.length();
        for(int i=0;i<=n/2;i++){
            if(name.charAt(i)!=name.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String name = "naman";
        if(is_palidrome(name)){
            System.out.println("This is a pallidrome");
        }
        else{
            System.out.println("This is not a pallidrome");
        }
    }
}