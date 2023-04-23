public class static_keyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Sahil";
        s1.schoolName="RVCP";
        System.out.println(s1.name);
        System.out.println(s1.schoolName);
        Student s2 = new Student();
        s2.name = "Rohan";
        s2.roll_no = 2001010407;
        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        System.out.println(s2.schoolName);
    }
}
class Student{
    String name;
    int roll_no;
    static String schoolName;
}