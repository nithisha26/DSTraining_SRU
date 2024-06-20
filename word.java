import java.util.*;
public class word {
    public static boolean isAvailable(char[][] arr,String s,int r,int c,int ind){
        if(r<0 || r>=arr[0].length || c<0 || c>=arr[0].length || arr[r][c]!=s.charAt(ind))
        return false;
        if(ind==s.length()-1){
            return true;
        }
        boolean found=isAvailable(arr,s,ind+1,r-1,c)||
                        isAvailable(arr,s,ind+1,r,c+1)||
                        isAvailable(arr,s,ind+1,r+1,c)||
                        isAvailable(arr,s,ind+1,r,c-1);

        return found;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        sc.nextLine();
        String s=sc.nextLine();
        //System.out.println(s);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==s.charAt(0)){
                    if(isAvailable(arr, s, i, j, 0)){
                        System.out.println("yes");
                        return;
                    }
                }
            }
        }
        System.out.println("no");
    }
}
