public class else_if {
    public static void main(String args[]){
        int age = 14;
        if(age>=18){
            System.out.println("You are adult now");  
        }
        else if(age>11&&age<18){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are a child");
        }
    }
    
}
