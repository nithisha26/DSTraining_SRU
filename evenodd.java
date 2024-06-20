import java.util.ArrayList;

public class evenodd {
    public static int recur2(int[] b,int a,int sum,int i){
        if(i==b.length)
        return sum;
        if(b[i]%2!=0){
            return recur2(b, a, sum+a+b[i], i+1);
        }
        return recur2(b, a, sum, i+1);
    }
    public static ArrayList<Integer> recur(int[] a,int[] b,ArrayList<Integer> ans,int i){
        if(i==a.length)
        return ans;
        if(a[i]%2==0){
           ans.add(recur2(b,a[i],0,0));
        }
        return recur(a,b,ans,i+1);
    }
    public static void main(String[] args) {
        int[] a={6,3,2,9,4,7};
        int[] b={8,7,5,3,6,9};
        ArrayList<Integer> ans=new ArrayList<>();
        System.out.println(recur(a,b,ans,0));
    }
}
