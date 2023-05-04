public class q7 {
    public static int countways(int arr[][],int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        int w1 = countways(arr,i+1,j,n,m);
        int w2=countways(arr,i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=2; int m=3;
        int arr[][]=new int[n][m];
        System.out.print(countways(arr,0,0,n,m));
    }
    
}
