public class spiral_matrx{
    public static void spiralmatrix(int matrix[][]){
        int start_row=0;
        int start_col=0;
        int end_row=matrix.length-1;
        int end_col = matrix[0].length-1;
        while(start_row<=end_row && start_col<=end_col){
            //Top
            for(int j = start_col;j<=end_col;j++){
                System.out.print(matrix[start_col][j]+" ");
            }
            //Right
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(matrix[i][end_col]+" ");
            }
            //Bottom
            for(int j=end_col-1;j>=start_col;j--){
                if(start_row==end_row){
                    break;
                }
                System.out.print(matrix[end_row][j]+" ");
            }
            //left
            for(int i=end_row-1;i>=start_row+1;i--){
                if(start_col==end_col){
                    break;
                }
                System.out.print(matrix[i][start_col]+" ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }
    
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiralmatrix(matrix);
    }
}