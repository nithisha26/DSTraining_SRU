import java.util.*;
public class adddigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] array=input.split(" ");
        Double[] nums=new Double[array.length];
        for(int i=0;i<array.length;i++){
            nums[i]=Double.parseDouble(array[i]);
        }
        
        //to know whether a number is decimal
        for(int i=0;i<nums.length;i++){
            if(nums[i]%1!=0)
            System.out.println(nums[i]);
        }
    }
}
