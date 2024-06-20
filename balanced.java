import java.util.*;
public class balanced {
    public static void main(String[] args) {
        String s="[{()]]";
        Stack<Character> stk=new Stack<>();
        int flag=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }
            else{
                if((stk.peek()=='('&&s.charAt(i)==')') || (stk.peek()=='['&&s.charAt(i)==']') || 
                (stk.peek()=='{'&&s.charAt(i)=='}') ){
                    stk.pop();
                }
                else{
                    System.out.println(i+1);
                    flag=1;
                    break;
                }
            }
            i++;
        }
        if(flag==0)
        System.out.println("-1");


    }
}
