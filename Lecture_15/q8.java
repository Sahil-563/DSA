public class q8 {
    public static void print_Sudoku(int sudoku[][]){
        for(int i=0;i<sudoku.length;i++){
            for(int j=0;j<sudoku.length;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    //issafe function
    public static boolean issafe(int sudoku[][],int row,int col,int digit){
        //for row
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //for column
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //for grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr;i<sr+3;i++){
            for(int j = sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    //sudoku solver function:--
    public static boolean SudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row == 9){
            return true;
        }
        int newrow = row; int newcol = col+1;
        if(col+1==9){
            newrow = row+1;
            newcol =0;
        }
        if(sudoku[row][col]!=0){
            return SudokuSolver(sudoku,newrow,newcol);
        }
        //is safe function
        for(int digit =1;digit<=9;digit++){
            if(issafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(SudokuSolver(sudoku,newrow,newcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        if(SudokuSolver(sudoku,0,0)){
            System.out.println("Solution is possible");
            print_Sudoku(sudoku);
        }
        else{
            System.out.println("Solution is not possible");
        }
        
    }
    
}
