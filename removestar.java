import java.util.*;
public class removestar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String ans="";
        int i=input.length()-1,cnt=0;
        while(i>=0){
            while(input.charAt(i)=='*'){
                cnt=cnt+1;
            }
            ans+=input.charAt(i);

        }
        System.out.println(ans);
    }
}
