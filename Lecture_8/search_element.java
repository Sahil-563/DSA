import java.util.*;
public class search_element{
    public static boolean search_key(int matrix[][],int key){
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("Key found at cell: ("+i+j+")");
                    return true;
                }
            }
        }
        System.out.print("Key not found at any cell");
        return false;
    }
    public static void print_Arr(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        print_Arr(matrix);
        search_key(matrix, 5);

    }
}