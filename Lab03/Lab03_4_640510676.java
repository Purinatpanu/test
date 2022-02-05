/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.Scanner;
public class Lab03_4_640510676 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = in.nextInt();
        

        grade [] st = new grade[n];
        for (int j=0;j<n;j++){
            
            System.out.println();
            System.out.println();
            System.out.println("Enter data for student#" +(j+1));
            st[j] = new grade();
            st[j].setdata();
            st[j].calgrade();
            
        }
        
        for (int k=0;k<n;k++){
            st[k].printgd(k+1);
        }
        
    in.close();
    }
}

class grade{
    private String id;
    private String gd;
    private int mid;
    private int fi;
    private int sc;
    private Scanner in = new Scanner(System.in);
    public void setdata(){
        
        System.out.print("Enter student ID: ");
        id = in.nextLine();
        System.out.print("Enter midterm and final scores: ");
        mid = in.nextInt();
        fi = in.nextInt();
    }
    public void calgrade(){
        sc = mid + fi;
        if (sc>=85)
            gd = "A";
        else if (sc>= 80 && sc<=84)
            gd = "B+";
        else if (sc>=75 && sc<=79)
            gd = "B";
        else if (sc>=60 && sc<=74)
            gd = "C+";
        else if (sc>=55 && sc<=59)
            gd = "C";
        else if (sc>=50 && sc<=54)
            gd = "D+";
        else if (sc>=45 && sc<=49)
            gd = "D";
        else
            gd = "F";
    }

    public void printgd(int k){
        System.out.println((k)+"    "  + id + "         "+ sc + "           " + gd);

    }

}
