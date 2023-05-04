public class q5 {
    public static boolean issafe(char[][] board,int row,int col){
        //vertical up
        for(int i =row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j = col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char board[][],int row){
        if(row == board.length){
            //print_board(board);
            count++;
            return;
    }
    for(int j=0;j<board.length;j++){
        if(issafe(board,row,j)){
            board[row][j]='Q';
            nqueens(board, row+1);
            board[row][j]='X';
        }
    }
}
static int count =0;
public static void print_board(char board[][]){
    System.out.println("-----chessBoard----");
    for(int i =0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}


public static void main(String args[]){
    int n = 2; //for 2x2 chessboard
    //Here we initialized our board with dot means at each cell there is nothing
    char board[][] = new char[n][n];
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='X';
        }
    }
    nqueens(board,0);
    System.out.print("Toatal number of ways = "+count);
    }
}