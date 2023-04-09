public class search_in_sorted_array{
    public static boolean stair_case(int matrix[][],int key){
        int row =0;
        int col=matrix.length-1;
        while(row<=matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.print("Found at cell: ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("Key not found");
        return false;

    }

    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,19,37,48},
                        {32,33,39,50}};
        int key = 33;
        stair_case(matrix, key);
    }
}