import java.util.*;
public class insertsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        HashSet<String> list=new HashSet<>();
        for(int i=0;i<n;i++){
            String[] s=arr[i].split(" ");
            if(s[0].charAt(0)=='1'){
                list.add(s[1]);
            }
            else if(s[0].charAt(0)=='2'){
                System.out.println(list.contains(s[1]));
            }
            else if(s[0].charAt(0)=='3'){
                int len=s[1].length(),cnt=0;
                for(String str : list){
                    String s1=str.substring(0, len);
                    if(s1.equals(s[1])){
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
            else{
                list.remove(s[1]);
            }
        }
        

    }
}
