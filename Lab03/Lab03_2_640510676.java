/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab03_2_640510676 {
    public static void main(String[] args) {
        int se;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        se = in.nextInt();
        
        time tr = new time();
        tr.caltime(se);
        tr.printftime();
        in.close();
    }
}
class time {
    private int d;
    private int re;
    private int hr;
    private int mn;

    public void caltime(int se) {
        d = se/86400;
        re = se%86400;

        hr = re/3600;
        re = re%3600;
        
        mn = re/60;
        re = re%60;
    }
    
    public void printftime(){
        System.out.printf("%d" + ":" + "%02d" + ":" + "%02d" + ":" + "%02d" , d,hr,mn,re);
    }
}
