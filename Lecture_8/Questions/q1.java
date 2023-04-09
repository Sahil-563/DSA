import java.util.*;
public class q1{
    public static int largest_element(int matrix[][]){
        int largest_num = Integer.MIN_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest_num){
                    largest_num = matrix[i][j];
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==largest_num){
                    System.out.println("Found at cell: ("+i+","+j+")");
                }
            }
        }
        return largest_num;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6}};
        System.out.print("The largest number is: "+largest_element(matrix));


    }
}