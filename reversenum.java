import java.util.*;
public class reversenum {
    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        rev=rev*10+(n%10);
        return reverse(n/10,rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=reverse(n,0);
        System.out.println(ans);
        
    }
}
