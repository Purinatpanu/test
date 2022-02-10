
import java.util.Scanner;

public class Lab10_2_640510676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape2Dim sh = new Shape2Dim();
        sh = new Rhombus();
        System.out.print("Input M : ");
        int m = in.nextInt();
        
        int []r = new int[50];
        int []s = new int[50];
        int []t = new int[50];
        int rco=0,sco=0,tco=0;

        for (int i=0;i<m;i++){
            sh.setn();
            if(sh.ty.equals("R") || sh.ty.equals("r") ){
                r[rco] = sh.n;
                rco ++;
            }
            else if(sh.ty.equals("S") || sh.ty.equals("s")){
                s[sco] = sh.n;
                sco++ ;
            }
            else if (sh.ty.equals("T") || sh.ty.equals("t")){
                t[tco] = sh.n;
                tco ++ ;    
            }
        }
        printShape(sh, r, s, t, rco, sco, tco);
        in.close();
    }

    static void printShape(Shape2Dim sh, int[]r, int[]s, int[]t, int rco, int sco, int tco){
        sh = new Rhombus();
        System.out.println("\nRhombus");
        for(int i = 0; i<rco; i++){
            ((Rhombus)sh).draw(r[i]); 
        }

        sh = new Square();
        System.out.println("\nSquare");
        for(int i = 0; i<sco; i++){
            ((Square)sh).draw(s[i]);  
        }

        sh = new Triangle();
        System.out.println("\nTriangle");
        for(int i = 0; i<tco; i++){
            ((Triangle)sh).draw(t[i]);
        }
    }

}

class Shape2Dim{
    protected int n;
    protected String ty;
    protected Scanner in = new Scanner(System.in);
    
    public void setn(){
        System.out.print("Input Type (R, S or T) and Size : ");
        ty = in.next();
        n = in.nextInt();
    }

    void draw(int n){} 
}

class Rhombus extends Shape2Dim{
    public void draw(int n){
        System.out.println();
        if(n > 0){
            String fsq = "%" + n + "c\n";
            String fsq2;
            System.out.printf(fsq,'*');
            for(int i=1;i<n;i++){
                fsq2 = "%" + (n-i) + "c%" + (2*i) + "c\n";
                System.out.printf(fsq2, '*', '*');
            }
            for(int i=n-2;i>=1;i--){
                fsq2 = "%" + (n-i) + "c%" + (2*i) + "c\n";
                System.out.printf(fsq2, '*', '*');
            }
            System.out.printf(fsq, '*');
        }
    }
}

class Square extends Shape2Dim{
    public void draw(int n){
        System.out.println();
        for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) 
				if((i==1 || i==n) || (j==1 || j==n))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
    }
}

class Triangle extends Shape2Dim{
    public void draw(int n){
        System.out.println();
        String fsq = "%" + n + "c\n";
        String fsq2;
        System.out.printf(fsq,'*');
        for(int i=1;i<n-1;i++){
            fsq2 = "%" + (n-i) + "c%" + (2*i) + "c\n";
            System.out.printf(fsq2, '*', '*'); 
        }
        for(int i=0;i<n;i++){
            System.out.print('*' + " ");
        }
        System.out.println();
    }
}