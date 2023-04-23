public class First_class{
    public static void main(String args[]){
        Pen p1 = new Pen();
        System.out.println(p1.color="Yellow");
        p1.set_pen_tip(5);
        System.out.println(p1.tip);
        Student s1 = new Student();
        s1.name("Sahil");
        System.out.println(s1.name1);

    }
}
class Pen{
    String color;  //We have defined variables in a class
    int tip;
    void set_pen_tip(int newtip){  //Defined a method
        tip = newtip;
    }
}
class Student{
    String name1;
    void name(String name){
        name1 = name;
    }
}
