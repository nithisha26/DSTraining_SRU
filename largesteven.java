import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class largesteven {
    public static void main(String[] args) {
        String s1="tu5g2k1h8";
        String s2="g5g8gd6h3";
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(Character.isDigit(ch)){
                set.add(ch-'0');
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(Character.isDigit(ch)){
                set.add(ch-'0');
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2==0){
                list.add(list.remove(i));
                break;
            }
        }
        String s="";
        for(int i=0;i<list.size();i++){
            s+=list.get(i);
        }
        System.out.println(Integer.parseInt(s));

    }
}
