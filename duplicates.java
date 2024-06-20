import java.util.ArrayList;

public class duplicates {
    public static void main(String[] args) {
        int[] arr={4,5,1,2};
        int n=arr.length;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        int j=0;
        while(j<n){
            for(int i=0;i<n;i++){
                if(arr[i]!=-1 && !list.contains(arr[i])){
                    list.add(arr[i]);
                    arr[i]=-1;
                    j++;
                }
            }
            //System.out.println(list);
            ans.add(list);
            list=new ArrayList<>();
        }
        System.out.println(ans);
    }
}
