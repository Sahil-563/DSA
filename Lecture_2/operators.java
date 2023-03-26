<<<<<<< HEAD
public class operators{
    public static void main(String args[]){
        //Binary Arithmetic operators in java:--
        int a = 2;
        int b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Unary Arithmetic operators in java:--
        float c = ++a; //Pre increament
        System.out.print(c+" ");
        System.out.println(a);
        float d = b++;  //post increament
        System.out.print(d+" ");
        System.out.print(b);
        
        //Relational operators:--
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a<b);

        //logical opearators:--
        int e = 3;
        int f = 4;
        System.out.print("Logical And:--");
        System.out.println((a==b)&&(e==f));
        System.out.print("Logical OR:--");
        System.out.println((a==b)||(e==f));
        System.out.print("Logical NOT:--");
        System.out.println(!(e==f));

        //Assignment operators:--
        e = f;
        System.out.println(e);
        e+=10;
        System.out.println(e);
    }
=======
public class operators{
    public static void main(String args[]){
        //Binary Arithmetic operators in java:--
        int a = 2;
        int b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Unary Arithmetic operators in java:--
        float c = ++a; //Pre increament
        System.out.print(c+" ");
        System.out.println(a);
        float d = b++;  //post increament
        System.out.print(d+" ");
        System.out.print(b);
        
        //Relational operators:--
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a<b);

        //logical opearators:--
        int e = 3;
        int f = 4;
        System.out.print("Logical And:--");
        System.out.println((a==b)&&(e==f));
        System.out.print("Logical OR:--");
        System.out.println((a==b)||(e==f));
        System.out.print("Logical NOT:--");
        System.out.println(!(e==f));

        //Assignment operators:--
        e = f;
        System.out.println(e);
        e+=10;
        System.out.println(e);
    }
>>>>>>> 77ae9b7 (Lecture_3 is added)
}