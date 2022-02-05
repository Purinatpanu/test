/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab01_1_640510676 {
    public static void main(String[] args) {
        int A,B,C,n,co;
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter A:");
        A = in.nextInt();
        //System.out.println("Enter B:");
        B = in.nextInt();
        //System.out.println("Enter C:");
        C = in.nextInt();
        
        if (1<=A && A<=B && B<=C && C<=10000000) {
        System.out.print(A+ " " +B);
        n = (2*A) + (B+1);
        co = 2;
        while(n<=C) {
            System.out.print(" "+n);
            co++;
            A = B;
            B = n;
            n = (2*A) + (B+1);
            }
        System.out.print("\n" + co);
        }
        else{
            co = 0;
            System.out.println("None");
            System.out.print(co);
        }
        in.close();
    }       
}
