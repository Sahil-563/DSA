public class constructors{
    public static void main(String args[]){
        Student s1 = new Student("Sahil",47);   //this is also constructors with some of the arguments
        
        System.out.println(s1.name);
        
        System.out.println(s1.Roll_no);
        Student s2=new Student("Rohit",42);
        System.out.println(s2.name);
        Student s3= new Student();
        
       
    }
}
public class Student{
    String name;
    int Roll_no;
    Student(String name,int Roll_no){    //This is a constructor with some parameters
        this.name =name;                 //This is a parameterized constructor
        this.Roll_no =Roll_no;
    }
    Student(){  //This is non parameterized constructor
        System.out.println("Constructor is made..");
    } 
      
    
}