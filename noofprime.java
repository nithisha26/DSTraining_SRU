import java.util.*;
public class noofprime {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int[] arr={2,3,5,7};
        while(n>0){
            int rem=n%10;
            if(isPrime(rem))
            cnt++;
            n/=10;
        }
        System.out.println(cnt);
        sc.close();
    }
}
