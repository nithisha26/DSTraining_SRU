import java.util.*;
public class countoddigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int lv=0,uv=0,lc=0,uc=0,d=0,s=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            d++;
            else if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                lv++;
                else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                uv++;
                else{
                    if(Character.isLowerCase(ch))
                    lc++;
                    else 
                    uc++;
                }
            }
            else{
                s++;
            }
        }
        System.out.println("lv - "+lv);
        System.out.println("uv - "+uv);
        System.out.println("lc - "+lc);
        System.out.println("uc - "+uc);
        System.out.println("d - "+d);
        System.out.println("s - "+s);
        sc.close();
    }
}
