import java.util.HashMap;

public class longestsubstring {
    public static void main(String[] args) {
        String s="abcdefg";
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int i=0;
        String str="";
        while(i<n){
            if(str.indexOf(s.charAt(i))==-1){
                str+=s.charAt(i);
                map.put(s.charAt(i),i);
            }
            else{
                max=Math.max(str.length(),max);
                str="";
            }
            i=map.get(s.charAt(i))+1;
        }
        max=Math.max(str.length(),max);
        System.out.println(max);
    }
}
