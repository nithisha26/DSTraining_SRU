import java.util.*;
public class Countofnums {
    public static void main(String[] args) {
        int[] arr={3,5,4,3,6,7,1,2,4,3,3,7,6,8,8};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }


    }
}
