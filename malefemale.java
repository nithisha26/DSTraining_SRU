import java.util.*;
public class malefemale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int cnt=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='M')
            cnt++;
            else
            cnt--;
        }
        if(cnt==0)
        System.out.println("0");
        else if(cnt>0)
        System.out.println("male");
        else
        System.out.println("female");

    }
}
