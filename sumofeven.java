import java.util.*;
public class sumofeven {
    public static ArrayList<Integer> rec(int[] nums,int i,int evenSum,int oddSum){
        if(i>=nums.length){
            return {evenSum,oddSum};
        }
        if(nums[i]%2==0)
        return rec(nums,i+1,evenSum+nums[i],oddSum);
        return rec(nums,i+1,evenSum,oddSum+nums[i]);

    }
    public static void main(String[] args) {
        int[] a={3,8,5,4,3};
        int[] b={5,0,9,3,2};
        System.out.println(rec(a,0,0,0));
    }

}
