public class p1{
    static int N;
    public static void print_sol(int sol[][]){
        for(int i=0;i<N;i++){
            for(int j =0;j<N;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    //issafe function
    public static boolean issafe(int maze[][],int x,int y){
        return(x>=0 && y>=0 && x<N && y<N && maze[x][y]==1);
    }

    //solvemaze function
    public static boolean solvemaze(int maze[][]){
        int sol[][]=new int[N][N];
        if(SolveMazeUtill(maze,0,0,sol)==false){
            System.out.print("Solution doesnot exist");
            return false;
        }
        print_sol(sol);
        return true;
    }

    //solve maze utill function
    public static boolean SolveMazeUtill(int maze[][],int x,int y,int sol[][]){
        //base case
        if(x==N-1 && y==N-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        if(issafe(maze,x,y)==true){
            if(sol[x][y]==1){
                return false;
            }
            sol[x][y]=1;
            if(SolveMazeUtill(maze,x+1,y,sol)){
                return true;
            }
            if(SolveMazeUtill(maze,x,y+1,sol)){
                return true;
            
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    
    public static void main(String args[]){
        int maze[][] = { { 1, 0, 1, 0 }, 
                        { 1, 1, 0, 1 }, 
                        { 0, 1, 0, 0 }, 
                        { 1, 1, 1, 1 } };
        N = maze.length;
        solvemaze(maze);
        
}
}