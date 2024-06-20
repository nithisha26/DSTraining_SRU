import java.util.*;
public class divisiblebyseven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(i%7==0)cnt++;
        }
        System.out.println(cnt);
        //alternate way -- O(1)
        System.out.println((b/7) - (a/7));

    }
}
