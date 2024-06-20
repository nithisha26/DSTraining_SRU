import java.util.*;
public class lengthsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int max=Integer.MIN_VALUE,cnt=1;
        for(int i=1;i<str.length();i++){
            char currChar=str.charAt(i);
            char prevChar=str.charAt(i-1);
            if((int)currChar==(int)(prevChar)+1){
                cnt++;
            }
            else{
                max=Math.max(cnt,max);
                cnt=1;
            }
        }
        max=Math.max(cnt,max);
        System.out.println(max);
    }
}
