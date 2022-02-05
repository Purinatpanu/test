/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab01_3_640510676 {
    public static void main(String[] args){
    int n,re=0,sm=0,co = 0,ch=0,last_re;
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter N: ");
    n = in.nextInt();
    in.close();
    sm = n;
    while (n>5){
        if (n>5){
            ch = 2*(n/5);
            re = n%5;
            sm += ch;
            n = ch + re;
            }
        co +=1;
        }
    last_re = re + ch; 
    
    System.out.println("Total number of drinking bottles = "+sm);
    System.out.println("Number for changing = "+co);
    System.out.println("The remaining empty bottles = "+last_re);
    }
}
    

