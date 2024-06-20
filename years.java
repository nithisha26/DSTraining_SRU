import java.util.*;
public class years {
    public static void main(String[] args) {
        int n=65476;
        int yr=n/360;
        n=n%360;
        int mnth=n/30;
        int week=(n%30)/6;
        int days=(n%30)%6;
        System.out.println(yr+" "+mnth+" "+week+" "+days);

    }
}
