import java.util.*;
public class treefire {
    public static void trees(int[][] arr,int row,int col){
        if(arr[row][col]==0)
        return;
        if(arr[row][col]==1){
            arr[row][col]=0;
        }
        //top
        if(row>0)
        trees(arr,row-1,col);
        //right
        if(col<arr.length-1)
        trees(arr,row,col+1);
        //bottom
        if(row<arr.length-1)
        trees(arr,row+1,col);
        //left
        if(col>0)
        trees(arr,row,col-1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r=sc.nextInt();
        int c=sc.nextInt();
        trees(arr,r-1,c-1);
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1)
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
