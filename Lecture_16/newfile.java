public class newfile {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.schoolname = "rvcp";
        s2.schoolname = "jwcp";
        System.out.println(s1.name="Sahil");
        System.out.println(s1.schoolname);
        System.out.println(s2.schoolname);
    }
}
class Student{
    String name;
    int Roll_no;
    String schoolname;
    public int add(int num1,int num2){
        return num1+num2;
    }
}