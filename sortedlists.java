import java.util.*;
class sortedlists{
    public static void main(String args[]){
        int[] arr1={2,5,7,9};
        int[] arr2={1,3,6,7,10,13};
        int n=arr1.length,m=arr2.length;
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++;
            }
            else{
                list.add(arr2[j]);
                j++;
            }
        }
        while(i<n){
            list.add(arr1[i]);
            i++;
        }
        while(j<m){
            list.add(arr2[j]);
            j++;
        }
        System.out.println(list);

    }
}