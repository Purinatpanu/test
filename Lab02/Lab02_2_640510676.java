/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab02_2_640510676 { 
    public static void main(String[] arge) {
        int n;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        n = in.nextInt();
        in.close();
        
        if (checkOddEven(n) == false)
            System.out.println(n + " is odd number.");
        else if  (checkOddEven(n) == true)
            System.out.println(n + " is even number.");
        
        if (checkPrime(n) == true)
            System.out.println(n + " is prime number.");
        else 
            System.out.println(n + " is not prime number.");
    
    }

    public static boolean checkOddEven(int n){
        if (n%2==0)
            return true;
        else
            return false;
    }
    
    public static boolean checkPrime(int n){
        int div = 2;
        while (div <= Math.sqrt(n)){
            if (n % div == 0)
                return false;
            else{
                if (div == 2)
                    div = 3;
                else
                    div += 1;
            }
        }
        return true;    
    }
}
