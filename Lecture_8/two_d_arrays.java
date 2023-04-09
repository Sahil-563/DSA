import java.util.*;
public class two_d_arrays{
    public static void print_arr(int matrix[][]){
        int n=matrix.length;
        int m =matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n=3;  //int n=matrix.length
        int m=3;  //int m=matrix[0].lenght

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        print_arr(matrix);
    }
}