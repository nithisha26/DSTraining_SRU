public class lenevenodd {
    public static boolean rec(int[] nums,int i,int j){
        if(i==j)
        return false;
        if(i>j)
        return true;
        return rec(nums,i+1,j-1);
    }
    public static void main(String[] args) {
        int[] input={5,8,9,5};
        int n=input.length;
        if(rec(input,0,n-1)){
            System.out.println("yes");
        }
        else
        System.out.println("no");
        
    }
}
