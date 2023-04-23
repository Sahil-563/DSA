public class Function_overloading{
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 4));
        System.out.println(calc.sum((float)2.0, (float)4.0));
        System.out.println(calc.sum(2, 4, 0));

    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}