public class sumgreater {
    public static void main(String[] args) {
        int[] arr={4,8,2,4,4,8,4,8,8,8,8};
        int n=arr.length;
        int ans=arr[0];
        int cnt=1;
        for(int i=1;i<n;i++){
            if(cnt==0){
                ans=arr[i];
                cnt=1;
            }
            else{
                if(arr[i]==ans){
                    cnt++;
                }
                else{
                    cnt--;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ans)
            c++;
        }
        if(c>n/2)
        System.out.println(ans);
        else
        System.out.println("-1");
    }
}
