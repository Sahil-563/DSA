public class p3{
    public static int swap_no(int num1,int num2){
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        return num1;
    }
    public static void main(String args[]){
        System.out.print(swap_no(1, 2));

    }
}