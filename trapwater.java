public class trapwater {
    public static void main(String[] args) {
        int[] arr={2,7,2,3,4};
        int[] maxLeft=new int[arr.length];
        int[] maxRight=new int[arr.length];
        int maxl=-1,maxr=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxl){
                maxLeft[i]=arr[i];
                maxl=arr[i];
            }
            else{
                maxLeft[i]=maxl;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxr){
                maxRight[i]=arr[i];
                maxr=arr[i];
            }
            else{
                maxRight[i]=maxr;
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.min(maxLeft[i],maxRight[i])-arr[i];
        }
        System.out.println(sum);
    }
}
