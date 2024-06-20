public class dpsubseq {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="axde";
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length()+1;i++){
            for(int j=0;j<s2.length()+1;j++){
                dp[i][j]=0;
            }
        }
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1]+1;
                else
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        System.out.println(dp[s1.length()][s2.length()]);
        int u=s1.length();
        int v=s2.length();
        String ans="";
        while(u!=0 && v!=0){
            if(s1.charAt(u-1)==s2.charAt(v-1)){
                ans=s1.charAt(u-1)+ans;
                u=u-1;
                v=v-1;
            }
            else{
                if(dp[u][v]==dp[u][v-1])
                v=v-1;
                else
                u=u-1;
            }
        }
        System.out.println(ans);
    }
}
