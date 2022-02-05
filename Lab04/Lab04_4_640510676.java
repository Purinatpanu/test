import java.util.*;
public class Lab04_4_640510676{
    public static void main(String[] args) {
        stu st = new stu();
        st.getn();
        st.setdata();
        st.checksub();
    }
}

class stu{
    private int n;
    private int sub;  
    private int co = 0;
    private String[][] list = new String[10][15];
    private String[] name = new String[10];
    private String subs;
    private Scanner in = new Scanner(System.in);


    public void getn(){
        System.out.print("Input number of students : ");
        n = in.nextInt();
        System.out.println();
        System.out.println();
    }

    public void setdata(){
        for (int st=0;st<n;st++){
            System.out.print("Student name: ");
            name[st] = in.next();
            System.out.print("Number of subjects: ");
            sub = in.nextInt();
            System.out.print("Course list: ");
            
            for (int i=0;i<sub;i++){
                list[st][i] = String.valueOf(in.nextInt());
                }
            System.out.println();
            System.out.println();   
        }
    }

    public void checksub(){
        System.out.print("Input subject for searching : ");
        subs = in.next();
        for (int k=0;k<n;k++){
            for (int j=0;j<sub;j++){
                if (subs.equals(list[k][j])){
                    System.out.println(name[k]);
                    co += 1;
                }
            }
        }
        System.out.printf("%d student(s)",co);
    }
}
