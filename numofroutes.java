import java.util.ArrayList;
import java.util.Arrays;

public class numofroutes {
    public static int recur(int[][] arr,int r,int c,ArrayList<ArrayList<Integer>> ans){
        if(r==arr.length-1 && c==arr[0].length-1){
            ans.add(new ArrayList<>(Arrays.asList(r, c)));
            System.out.println(ans);
            ans.remove(ans.size() - 1);
            return 1;
        }
        if(r==arr.length || c==arr[0].length || r==-1 || c==-1 || arr[r][c]==1){
            return 0;
        }
        arr[r][c]=1;
        ans.add(new ArrayList<>(Arrays.asList(r, c)));
        int right=recur(arr,r,c+1,ans);
        int down=recur(arr,r+1,c,ans);
        int up=recur(arr,r-1,c,ans);
        int left=recur(arr,r,c-1,ans);
        arr[r][c]=0;
        ans.remove(ans.size() - 1);
        return right+down+up+left;
    }
    public static void main(String[] args) {
        int n=2,m=2;
        int[][] arr=new int[n][m];
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        System.out.println(recur(arr,0,0,ans));
    }
}
