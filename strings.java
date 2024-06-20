import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String res="";
        int i=0,cnt=1;
        while(i<n){
            if(i==n-1 || str.charAt(i)!=str.charAt(i+1)){
                String s=str.charAt(i)+Integer.toString(cnt);
                res+=s;
                // System.out.print(str.charAt(i));
                // System.out.print(cnt);
                cnt=1;
            }
            else{
                cnt++;
            }
            i++;
        }
        System.out.println(res);
        sc.close();
    }
}
