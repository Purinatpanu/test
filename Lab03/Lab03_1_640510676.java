/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/

import java.util.*;
public class Lab03_1_640510676 {
    public static void main(String[] args) {
         Human fu = new Human();
    
        fu.setdata();
        fu.calsha();
        fu.printsha();
    }
}

class Human{
    private char sex;
    private float wei;
    private float hei;
    private String sha;
    
    public void setdata(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sex: ");
        sex = in.nextLine().charAt(0);
        System.out.print("Enter wieght: ");
        wei = in.nextFloat();
        System.out.print("Enter height: ");
        hei = in.nextFloat();
        in.close();
    }

    public void calsha(){
        if (sex == 'f' || sex == 'F')
            if (hei-110 > wei)
                sha = "Your shape is OK.";
            else 
                sha = "Your shape is not OK.";
        if (sex == 'm' || sex == 'M')
            if (hei-100 > wei)
                sha = "Your shape is OK.";
            else 
                sha = "Your shape is not OK.";    
    }

    public void printsha(){
        System.out.print(sha);
    }
}