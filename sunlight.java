public class sunlight {
    public static void main(String[] args) {
        int[] arr={3,4,5,10,4,3};
        int max=-1,leftcnt=0,rightcnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                leftcnt++;
                max=arr[i];
            }
        }
        max=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                rightcnt++;
                max=arr[i];
            }
        }
        System.out.println(leftcnt+" "+rightcnt);
    }
}
