public class q4 {
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
            print_board(board);
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
    int n = 4; //for 2x2 chessboard
    //Here we initialized our board with dot means at each cell there is nothing
    char board[][] = new char[n][n];
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='X';
        }
    }
    nqueens(board,0);
    }
}