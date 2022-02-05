import java.util.Scanner;

public class Lab05_1_640510676 {
    public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Input N : ");
    n = in.nextInt();
    
    gpa gx = new gpa();
        gx.setdata(n);
        gx.getscore(n);
        gx.calgpa(n);
        gx.print(n);
    in.close();  
    }
      
}

class gpa{
    private char[] gra = new char[10];
    private int[] cre = new int[10];
    private int[] score = new int[10];
    private int sum_cre;
    private int sum_sc;
    private float gpax;
    private Scanner in = new Scanner(System.in);
    
    public void setdata(int n){
        for (int i=0;i<n;i++){
            System.out.println("Subject #"+(i+1));
            System.out.print("Input Grade: ");
            gra[i] = in.next().charAt(0);
            System.out.print("Input Credit: ");
            cre[i] = in.nextInt();
            System.out.println();
            System.out.println();
        }
    }
    
    public int[] getscore(int n){
        for (int j=0;j<n;j++){
            switch (gra[j]){
                case 'A':
                    score[j] = 4;
                    break;
                case 'B':
                    score[j] = 3;
                    break;
                case 'C':
                    score[j] = 2;
                    break;
                case 'D':
                    score[j] = 1;
                    break;
                case 'F':
                    score[j] = 0;
                    break;
            }
        }
        return score;
    }
    
    public void calgpa(int n){
        for (int i=0;i<n;i++){
            sum_cre += cre[i];
            sum_sc += cre[i]*score[i];
        }
        gpax = sum_sc/(float)sum_cre;
    }

    public void print(int n){
        System.out.println("              Grade   " + "GradePoint   " + "Credit   " + "TotalPoint");
        for (int i=0;i<n;i++){
            System.out.printf("Subject "+ (i+1) + "       %c     " + "    %d      " +"     %d      " + "    %d "+"\n",gra[i],score[i],cre[i],cre[i]*score[i]);
            
        }
        System.out.printf("Total                                 %d         %d" + "\n",sum_cre,sum_sc);
        System.out.printf("GPA = %.01f",gpax);
    }
    
    

}