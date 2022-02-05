import java.util.Scanner;

public class Lab06_1_640510676 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input N: ");
    int n = in.nextInt();
    System.out.print("Input X: "); 
    char x = in.next().charAt(0);
    System.out.print("Input Type: ");
    char ty = in.next().charAt(0);
    in.close();
    Drawing d = new Drawing();
    d.drawTriangle(n);
    d.drawTriangle(n,x);
    d.drawTriangle(n,x,ty);

    }
}

class Drawing{
    public void drawTriangle(int N){
        for(int i=N;i>0;i--){
            for(int j=0;j< i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangle(int N, char X){
        for(int i=N;i>0;i--){
            for(int j=0;j< i;j++){
                System.out.print(X);
            }
            System.out.println();
        } 
    }

    public void drawTriangle(int N, char X, char Type){
        if (Type == 'R'){
            for (int i=0;i<N;i++){
                for(int j=0;j<i;j++){
                    System.out.print(' ');
                } 
                for(int k=0;k<N-i;k++){
                    System.out.print(X);
                }
                System.out.println();  
            }
        }

        else if (Type == 'L'){
            for(int i=N;i>0;i--){
                for(int j=0;j< i;j++){
                    System.out.print(X);
                }
                System.out.println();
            }            
        }
    }

}