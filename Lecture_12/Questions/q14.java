public class q14 {
    public static void printbinString(int n,String str,int lastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinString(n-1, str+"0", 1);
        if(lastPlace == 0){
            printbinString(n-1, str+"1",0);
            
        }
    }
    public static void main(String args[]){
        int n = 3;
        printbinString(n, "", 0);

    }
    
}
