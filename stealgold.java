import java.util.Arrays;

public class stealgold {
    public static int recur(int[] arr){
        if(arr.length==0)
        return 0;
        if(arr.length==1)
        return arr[0];
        if(arr.length==2)
        return Math.max(arr[0],arr[1]);
        int left=arr[0]+recur(Arrays.copyOfRange(arr,2,arr.length));
        int right=arr[1]+recur(Arrays.copyOfRange(arr,3, arr.length));
        return Math.max(left,right);
    }
    public static void main(String[] args) {
        int[] arr={13,9,4,10,5,7};
        System.out.println(recur(arr));
    }
}
