import java.util.*;
public class findstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        //boolean[][] visited=new boolean[n][n];
        String str=sc.next();
        int flag=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int a=i%n,cnt=0;
            for(int j=0;j<n;j++){
                if(arr[a][j]==ch){
                    cnt++;
                    arr[a][j]='-';
                    break;
                }
            }
            if(cnt==0){
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
