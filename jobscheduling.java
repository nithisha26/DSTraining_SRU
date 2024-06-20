import java.util.ArrayList;
import java.util.Arrays;

public class jobscheduling {
    public static void main(String[] args) {
        int[][] nums={{1,3},{2,5},{4,6},{6,7},{5,8},{7,9}};
        int[] arr={5,6,5,4,11,2};
        int n=nums.length;
        int[] temp=Arrays.copyOf(arr, arr.length);;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j][1]<=nums[i][0]){
                    if(temp[j]+arr[i]>temp[i])
                    temp[i]=temp[j]+arr[i];
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
