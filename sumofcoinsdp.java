public class sumofcoinsdp {
    public static void main(String[] args) {
        int[] arr={2,3,5,6};
        int t=11;
        int n=arr.length;
        int[][] dp=new int[n][t+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=t;i++){
            if(i==arr[0])
            dp[0][i]=1;
            else
            dp[0][i]=0;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j<arr[i]){
                    dp[i][j]=dp[i-1][j];
                }
                else if(j==arr[i]){
                    dp[i][j]=1;
                }
                else{
                    if(dp[i-1][j]==0)
                    dp[i][j]=dp[i-1][j-arr[i]];
                    else
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        if(dp[n-1][t]==1)
        System.out.println("true");
        else
        System.out.println("false");

    }
}
