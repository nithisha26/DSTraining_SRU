import java.util.*;
public class sortthree {
    public static void main(String[] args) {
        int[] arr={4,9,8,2,14,3,5,6};
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int a=arr[i],b=arr[i+1],c=arr[i+2];
            if(a<b && a<c){
                arr[i]=a;
            }
            else if(b<a && b<c){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=temp;
            }
            if(arr[i+1]>arr[i+2]){
                int temp=arr[i+1];
                arr[i+1]=arr[i+2];
                arr[i+2]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
