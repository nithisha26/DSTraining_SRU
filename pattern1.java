import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=2;j<=n-1;j++){
                    cnt+=1;
                    System.out.print(cnt);
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
