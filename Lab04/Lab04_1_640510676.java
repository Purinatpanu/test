import java.util.Scanner;
public class Lab04_1_640510676 {
    public static void main(String[] args) {
        matrix mat = new matrix();
        mat.setdata();
        mat.checkid();
        mat.printmat();
    }
}

class matrix{
    private int n;
    private int[][] mat;
    private boolean id = true;
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
    
    public void checkid(){
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++){
                if (mat[i][j]>0 && i!=j)
                    id = false;
                else if (mat[i][j] != 1 && i==j)
                    id = false;
        }
    }

    public void printmat(){
        for (int k=0;k<n;k++){
            for (int l=0;l<n;l++){
                System.out.printf("%4d", mat[k][l]);
            }
            System.out.println();
        }
        System.out.println();

        if (id == true)
            System.out.println("This matrix is identity matrix.");
        else
            System.out.println("This matrix is not identity matrix.");
    }
}