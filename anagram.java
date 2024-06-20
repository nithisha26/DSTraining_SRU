import java.util.*;
public class anagram {
    public static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    public static void main(String[] args) {
        String s="school";
        int k=3;
        char[] arr1={'L','R','L'};
        int[] arr2={2,3,1};
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]=='L')
            str.append(s.charAt(arr2[i]));
            else
            str.append(s.charAt(s.length()-arr2[i]));
        }
        String ans=str.toString();
        System.out.println(ans);
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            
            list.add(s.substring(i, i+3));
        }
        //System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(sortString(ans).equals(sortString(list.get(i))))
            System.out.println("anagram");
        }
    }
}
