public class sumofprime {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static int prime(int[] arr,int start,int end){
        for(int i=end-1;i>start;i--){
            if(isPrime(i))
            return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={14,16,20,22};
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum+=prime(arr,arr[i],arr[i+1]);
        }
        System.out.println(sum);
    }
}
