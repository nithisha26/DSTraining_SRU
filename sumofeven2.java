public class sumofeven2 {
    public static int rec(int n){
        if(n==0)
        return 0;
        return n+rec(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        if(n%2==0)
        System.out.println(rec(n));
        else
        System.out.println(rec(n-1));
        int x=1^2^3;
        System.out.println(2^3);
    }
}
