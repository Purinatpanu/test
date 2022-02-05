/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab01_2_640510676 {
    public static void main(String[] args){
        int sc,max,min,posx = 1,posn = 1,lower = 0,sum = 0;
        float av,co =.0f;
        boolean findn = true , findm = true;
        ArrayList <Integer> smsc = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter score between 1-100 or press 0 for stop");
        sc = in.nextInt();
    
        while (sc != 0) {
            if (sc >= 1 && sc<=100){
                smsc.add(sc);
                }
            else {
                System.out.println("Enter score again (between 1-100 or press 0 for stop");
                }
            sc = in.nextInt();
        }
        in.close();
        max = Collections.max(smsc);
        min = Collections.min(smsc);
        
        for (int i = 0;i<smsc.size();i++){
            if (max == smsc.get(i))
                if (findm == true){
                    posx += i;
                    findm = false;
                }
            if (min == smsc.get(i))
                if (findn == true){
                    posn += i;
                    findn = false;
                }
            sum += smsc.get(i);
            co +=1;
        }
        
        av = sum/co;
        for (int j : smsc){
            if (av > j)
                lower +=1;
        }
        System.out.println("Maximum Score = " + max + ",position = " + posx);
        System.out.println("Minimum Score = " + min + ",position = " + posn);
        System.out.println("Average Score = " + av);
        System.out.println("The number of students who scored below average score = " + lower);
    }
}