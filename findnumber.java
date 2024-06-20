import java.util.*;
public class findnumber {
    public static void main(String[] args) {
        int n=7;
        int[] arr={0,5,3,6,7,2,1};
        int ans=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(ans-sum);
    }
}
