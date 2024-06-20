import java.util.*;
public class backletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int key=sc.nextInt();
        String ans="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            // int a=ch-'a';
            // int x=0;
            // if(a-(key%26)<0)
            // x=26+(a-(key%26));
            // else
            // x=a-(key%26);
            // ans+=(char)((x)+'a');
            int req=key%26;
            if(((int)ch-req)>=97)
            ans+=(char)(((int)ch)-req);
            else
            ans+=(char)((int)ch-req+26);
        }
        System.out.println(ans);
    }
}
