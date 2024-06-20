import java.util.*;
public class islands {
    public static int recur(int[][] arr,int r,int c,int area){
        if (r < 0 || r >= arr.length || c < 0 || c >= arr[0].length || arr[r][c] != 1) {
            return area;
        }
        arr[r][c] = 0;
        area=area+1;
        area=recur(arr, r - 1, c,area); // top
        area=recur(arr, r + 1, c,area); // bottom
        area=recur(arr, r, c - 1,area); // left
        area=recur(arr, r, c + 1,area); // right
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[][] arr={{0,1,0,0,1},{1,0,0,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,0,0,0,1}};
        int area=0,max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    int c=recur(arr,i,j,0);
                    if(c>max)
                    max=c;    
                }
            }
        }
        System.out.println(max);
        
    }
}
