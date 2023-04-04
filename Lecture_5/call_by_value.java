public class call_by_value {
    public static void swap(int a ,int b){
        int temp = a;
        a= b;
        b = temp;

    }
    public static void main(String args[]){
        int a =5;
        int b= 10;
        swap(a,b);
        System.out.println("a = "+a);//here the numbers are not swapped since the copy of a and b is send not the actual value is send
        System.out.print("b = "+b);
    }
    
}
