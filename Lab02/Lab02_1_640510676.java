/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab02_1_640510676 {
    public static void main(String[] args) {
        char ch;
        int n;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Alphabet: ");
        ch = in.nextLine().charAt(0);
    
        
        System.out.print("Enter Number: ");
        n = in.nextInt();
        
        while (n<2||n>10) {
            System.out.print("Input again(2-10), Enter Number: ");
            n = in.nextInt();
        } 

        in.close();

        if(ch >= 'a' && ch <= 'z')
            printStarDown(n);
        else if(ch >= 'A' && ch <= 'Z')
           printStarUp(n);
        else
           printStarBoth(n);
    }
    
    public static void printStarUp(int n){
         for(int row = n;row >= 1;row--){
             for(int col = 1;col <= n;col++){
                if (col>=row)
                    System.out.print("*");
                else   
                    System.out.print(" ");
             }
             System.out.println();
         }
    }
    
    public static void printStarDown(int n){
        for(int row = n;row >= 1;row--){
             for(int col = 1;col <= row;col++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
    
    public static void printStarBoth(int n){
        printStarUp(n);
        printStarDown(n-1);
    }
    
}
