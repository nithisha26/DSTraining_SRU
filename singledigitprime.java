import java.util.*;
public class singledigitprime {
    public static int isPrime(int n){
        int sum=0;
        int temp=n;
        do{
            sum=0;
            while(temp>0){
                int rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            temp=sum;    
        }while(sum>9);
        if(sum==2 || sum==3 || sum==5 || sum==7){
            return n;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(isPrime(n)==-1){
            n=n+1;
        }
        System.out.println(n);
        
        sc.close();
    }
}
