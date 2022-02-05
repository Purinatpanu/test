/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab02_3_640510676 {
    public static void main(String[] args) {
        int n,x,y,q1=0,q2=0,q3=0,q4=0,ox=0,oy=0,oo=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = in.nextInt();
        for (int i = 1;i <= n;i++){
            System.out.print("Enter point #"+ i +": ");
            x = in.nextInt();
            y = in.nextInt();
           
            if (checkQuadant(x, y) == 1)
                q1 += 1;
            else if (checkQuadant(x, y) == 2)
                q2 += 1;
            else if (checkQuadant(x, y) == 3)
                q3 += 1;
            else if (checkQuadant(x, y) == 4)
                q4 += 1;
            else if (checkQuadant(x, y) == 5)
                ox += 1;
            else if (checkQuadant(x, y) == 6)
                oy += 1;
            else 
                oo += 1;
        }
        if (q1 > 0)
            System.out.println("Number of points in Qaudrant 1 = "+ q1);
        if (q2 > 0)
            System.out.println("Number of points in Qaudrant 2 = "+ q2);
        if (q3 > 0)
            System.out.println("Number of points in Qaudrant 3 = "+ q3);
        if (q4 > 0)
            System.out.println("Number of points in Qaudrant 4 = "+ q4);
        if (ox > 0)
            System.out.println("Number of points on X axis = "+ ox);
        if (oy > 0)
            System.out.println("Number of points on X axis = "+ oy);
        if (oo >0) 
            System.out.println("Number of points on origin point = "+ oo);    
        in.close();
    }

    public static int checkQuadant(int x,int y){
        if (x >0 && y>0)
            return 1;
        else if (x<0 && y>0)
            return 2;
        else if (x<0 && y<0)
            return 3;
        else if (x>0 && y<0)
            return 4;
        else if (x == 0 && y !=0)
            return 5;
        else if (y == 0 && x !=0)
            return 6;
        else 
            return 7;
    }
}