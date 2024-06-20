public class palindrome {
    public static boolean isPalindrome(int n){
        String s=Integer.toString(n);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=121;
        if(isPalindrome(n)){
            System.out.println(n);
        }
        else{
            String s=Integer.toString(n);
            if(s.length()%2==0){
                String s1=s.substring(0,s.length()/2);
                for(int i=s1.length()-1;i>=0;i--){
                    s1+=s1.charAt(i);
                }
                int num=Integer.parseInt(s1);
                if(num<n){
                    
                }
            }
        }
    }
}
