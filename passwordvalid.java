import java.util.*;
public class passwordvalid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int res2=0,ans=0;
        int nu=0,nl=0,nd=0,ns=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isLetter(ch)){
               if(Character.isLowerCase(ch))
               nl=1;
               else
               nu=1;
            }
            else if(Character.isDigit(ch)){
                nd=1;
            }
            else{
                ns=1;
            }
        }
        res2=4-(nl+nu+nd+ns);
        if(input.length()<8){
            ans=8-input.length();
            if(res2>ans){
                ans=ans+(res2-ans);
            }
            System.out.println(ans);
        }
        else if(res2!=0){
            System.out.println(res2);
        }
        else{
            System.out.println("-1");
        }
        
        sc.close();
    }
}