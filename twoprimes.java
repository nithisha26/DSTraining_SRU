public class twoprimes {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=11;
        int flag=0;
        for(int i=1;i<=n/2;i++){
            if(isPrime(i)&&isPrime(n-i)){
                flag=1;
                System.out.println("yes");
                break;
            }
        }
        if(flag==0){
            System.out.println("no");
        }
    }
}
