/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab03_3_640510676 {
    public static void main(String[] args) {
        
        parking pk = new parking();
        System.out.println("Enter data for vehicle parking#1");
        pk.setdata();
        pk.calc();
        
        parking pk1 = new parking();
        System.out.println("Enter data for vehicle parking#2");
        pk1.setdata();
        pk1.calc();
        
        pk.printc();
        pk1.printc();
      
    }
}

class parking {
    private char type;
    private int mn,re;
    private double pc = 0.0;
    private double hr;
    private Scanner in = new Scanner(System.in);
    public void setdata(){
        
        System.out.print("Enter vehicle type: ");
        type = in.nextLine().charAt(0);
        System.out.print("Enter minutes: ");
        mn = in.nextInt();
        
    }

    public void calc() {
        if (type == 'c' || type == 'C') {
        while (mn >0){
            if ( mn > 240){
                re = mn-240;
                pc += re*0.25;
                mn = mn - re;
            }
            else if (mn>120){
                re = mn-120;
                pc += re*0.50;
                mn = mn - re;
            }
            else if (mn>60){
                re = mn-60;
                pc += re*0.75;
                mn = mn - re;
            }
            else{
                pc += mn;
                break;
                }
            }
        } 
        else {
            hr = Math.ceil(mn/(float) 60);
            pc += hr*5;
        }
    }

    public void printc(){
        System.out.printf("Cost = " + "%.02f" + " baht(s)" ,pc);
        System.out.println();
    }
}