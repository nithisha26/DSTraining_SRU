public class coinchange {
    public static void main(String[] args) {
        int[] arr={3,4};
        int n=6;
        int[]dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        dp[0]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<dp.length;j++){
                if(j>=arr[i]){
                    if(dp[j-arr[i]]!=-1){
                        if(dp[j]!=-1)
                        dp[j]=Math.min(dp[j],dp[j-arr[i]]+1);
                        else
                        dp[j]=dp[j-arr[i]]+1;
                    }
                }
            }
        }
        System.out.println(dp[n]);
        // for(int i=0;i<dp.length;i++){
        //     System.out.print(dp[i]+" ");
        // }

    }
}
