public class stringnum {
    public static int find(String s2,int len){
        while(len>=1){
            char x=(char)(len+'0');
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)==x){
                    return len;
                }
            }
            len--;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        String s="hello:5438,car:214,book:8799,apple:2187";
        String ans="";
        String[] s1=s.split(",");
        for(int i=0;i<s1.length;i++){
            String[] s2=s1[i].split(":");
            int len=s2[0].length();
            int n=find(s2[1],len);
            if(n==-1){
                ans+='x';
            }
            else{
                ans+=s2[0].charAt(n-1);
            }

        }
        System.out.println(ans);
    }
}
