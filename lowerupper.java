import java.util.*;
public class lowerupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                str=str.replace(ch, Character.toUpperCase(ch));
            }
            else{
                str=str.replace(ch, Character.toLowerCase(ch));
            }
        }
        System.out.println(str);
        sc.close();
    }
}
