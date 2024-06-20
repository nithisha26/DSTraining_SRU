public class largestFactor {
    public static void main(String[] args) {
        int n=12;
        int k=4;
        if(k==1){
            System.out.println(n);
        }
        else{
            int c=1;
            for(int i=n/2;i>=1;i--){
                if(n%i==0)
                c++;
                if(c==k){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
