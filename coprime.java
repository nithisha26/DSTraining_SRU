public class coprime {
    public static void main(String[] args) {
        int n1=2;
        int n2=3;
        int n=Math.min(n1/2,n2/2);
        int flag=0;
        for(int i=2;i<=n;i++){
            if(n1%i==0 && n2%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("co prime");
        }
        else{
            System.out.println("not a co prime");
        }
    }
}
