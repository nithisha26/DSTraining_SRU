import java.util.ArrayList;

public class sumofcoins {
    public static boolean fn(int[] arr,int t,int ind){
        if(t==0){
            return true;
        }
        if(ind==arr.length)
        return false;
        //pick
        if(fn(arr,t-arr[ind],ind+1))
        return true;
        // non pick
        return fn(arr,t,ind+1);
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,6};
        int t=11;
        System.out.println(fn(arr,t,0));
    }
}
