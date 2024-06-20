import java.util.*;
public class maxprofit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,4,2,9,2,1};
        int buy=arr[0],sell=arr[0],maxProfit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>buy && arr[i]-buy > maxProfit){
                sell=arr[i];
                maxProfit=arr[i]-buy;
            }
            else if(arr[i]<buy){
                buy=arr[i];
            }
        }
        System.out.println(maxProfit);
    }
}
