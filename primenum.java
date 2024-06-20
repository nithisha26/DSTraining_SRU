import java.util.*;
public class primenum {
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
        if(isPrime(n))
        System.out.println("prime");
        else{
            while(!isPrime(n)){
                n=n+1;
            }
            System.out.println(n);
        }
        sc.close();
    }
}
