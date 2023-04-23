public class copy_constructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name ="Sahil";
        s1.roll_no = 123;
        s1.marks[0]=99;
        s1.marks[1]=100;
        s1.marks[2]=98;
        Student s2 = new Student(s1);
        s2.name ="Rahul";
        System.out.println(s2.name);
        s1.marks[0]=100; //Since arrays are called by refernce so the marks with s2 can also be changed
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }

    }
}
class Student{
    String name;
    int roll_no;
    int marks[]=new int[3];
    Student(){  //This is the constructor of object s1
    }
    //This is a Shallow copy constructor:--
    /*Student(Student s1){
        marks=new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        this.marks = s1.marks;
    }*/

    //This is a deep constructor
    Student(Student s1){
        marks=new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
