public class hrminsec {
    public static void main(String[] args) {
        int n=7262;
        int hr=n/3600;
        n=n%3600;
        int min=n/60;
        int sec=n%60;
        System.out.println(hr+"h:"+min+"m:"+sec+"s");
    }
}
