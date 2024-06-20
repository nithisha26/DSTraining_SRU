import java.util.*;
public class combinations {
    public static void recur(int[] arr,int k,int i,ArrayList<Integer> list){
        if(list.size()==k){
            System.out.println(list);
            return;
        }
        for(int j=i;j<arr.length;j++){
            list.add(arr[j]);
            recur(arr,k,j+1,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
        //         }
        //     }
        // }
        ArrayList<Integer> list=new ArrayList<>();
        recur(arr,3,0,list);
    }
}
