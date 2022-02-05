/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab02_4_640510676 {
    public static void main(String[] args) {
    int n,max;
    
    Scanner in = new Scanner(System.in);

    System.out.print("Enter N: ");
    n = in.nextInt();
    int []A = new int[n];
    A = getData(n);
    findAinB(n,A);    
    max = findMax(n,A);
    System.out.println("Maximum is A is " + max);
    in.close();
    }

    public static int[] getData(int n){
        int []ar = new int[n];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Members of Array : ");
        for (int i = 0;i < n;i++){ 
            ar[i] = in.nextInt();
        }
        in.close();
        return ar;
        
    }

    public static void findAinB(int n,int[] A){
        int m;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter M: ");
        m = in.nextInt();
        int []B = new int[m];
        int []inp = new int[n];
        
        B = getData(m);

        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (A[i] == B[j])
                    inp[i] += 1;   
            }
        }
        for (int k = 0;k < n;k++){
            System.out.println("Finding " + A[k] + " in array B : " + inp[k]);
        }
        in.close();

    }
    public static int findMax(int n,int[] A) {
        int max=0;      
        for (int l=0;l<n;l++){
            if (A[l] > max)
                max = A[l];
        }
        return  max;
    }
}
