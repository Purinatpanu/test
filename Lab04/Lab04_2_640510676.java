import java.util.*;
public class Lab04_2_640510676 {
    public static void main(String[] args) {
        checklr mat = new checklr();
        mat.setdata();
        mat.checkeq();
    }
}

class checklr{
    private int n;
    private int[][] mat;
    private int suml = 0;
    private int sumr = 0;

    public void setdata(){
        Scanner in = new Scanner(System.in);
        System.out.print("Inter size N : ");
        n = in.nextInt();
        mat = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("Input number " + "[" + i + "]"+ "[" + j + "] : ");
                mat[i][j] = in.nextInt();
            }
        
        System.out.println();
        System.out.println();
        }
        in.close();
    }

    public void checkeq(){
        for (int k=0;k<n;k++){
            suml += mat[k][k];
            sumr += mat[k][n-k-1];
        }
        if (suml == sumr)
            System.out.print("Equal");
        else
            System.out.print("Not Equal");
    }
}