public class subsequences {
    public static void recur(String s,String ans,int i){
        System.out.println(ans);
        if(i==s.length()){
            return;
        }
        for(int j=i;j<s.length();j++){
            recur(s,ans+s.charAt(j),j+1);
        }
    }
    public static void main(String[] args) {
        String s="abcd";
        recur(s,"",0);
    }
}
