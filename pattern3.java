import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n+1;i++){
            int c=1;
            for(int j=0;j<i;j++){
                System.out.print(c);
                c++;
            }
            c--;
            for(int j=0;j<(2*n+1)-(2*i);j++){
                System.out.print(c);
            }
            for(int j=0;j<i;j++){
                c--;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
