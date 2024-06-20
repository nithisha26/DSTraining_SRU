import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("_");
            }
            char ch='a';
            for(int j=0;j<2*i+1;j++){
                if(j<(2*i+1)/2){
                    System.out.print(ch);
                    ch+=1;
                }
                else if(j==(2*i+1)/2){
                    System.out.print(ch);
                }
                else{
                    ch-=1;
                    System.out.print(ch);
                }
            }
            for(int j=0;j<n-i;j++){
                System.out.print("_");
            }
            System.out.println();

        }
    }
}
