//Arrays are always called by refernce :=
//Means the changes made in sub function also reflect in main function
public class array_As_args {
    public static void update(int marks[],int nochange){
        nochange=5;
        for(int i =0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int nochange = 10;
        int marks[]={67,45,34};
        update(marks,nochange);   //By this function the actual marks in main function got updated
        System.out.println(nochange);  //but the value of no change remains the same
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        
    }
    
}
