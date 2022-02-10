/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/

import java.util.*;

public class Lab10_1_640510676 {
    public static void main(String[] args) {
        Student []stu = new Student[100];
        Scanner in = new Scanner(System.in);
        int Index = 0;
        char stuType, another;
        int uGrade = 0;
        int sGrade = 0;
        while (true){
            System.out.print("Enter undergraduate student or graduate student (u/g) : ");
            stuType = in.nextLine().charAt(0);
            if (stuType == 'u' || stuType == 'U'){
                stu[Index] = new Undergraduate();
                stu[Index].setdata();
                ((Undergraduate)stu[Index]).setProject();
                ((Undergraduate)stu[Index]).calGrade();
                
                if(stu[Index].gra == 'U'){
                    uGrade ++ ;
                }
                else{
                    sGrade ++ ;
                }
                    
                Index ++ ;
                System.out.print("Enter another (y/n)?: ");
                another = in.nextLine().charAt(0);
                System.out.println();
                if(another == 'n')
                    break;
            }

            else{
                stu[Index] = new Graduate();
                stu[Index].setdata();
                ((Graduate)stu[Index]).setPublication();
                ((Graduate)stu[Index]).calGrade();
                
                if(stu[Index].gra == 'U'){
                    uGrade ++ ;
                }
                else{
                    sGrade ++ ;
                }
                Index ++ ;
                System.out.print("Enter another (y/n)?: ");
                another = in.nextLine().charAt(0);
                System.out.println();
                if(another == 'n')
                    break;
            }
        }
        reprotGrade(Index, stu, uGrade, sGrade);
    }

    static void reprotGrade(int Index, Student[] stu, int uGrade, int sGrade){
        System.out.println("Grade Report");
        System.out.println("= = = = = = = = =");
        for(int i = 0; i < Index; i++){
            System.out.println(stu[i].na + " gets grade " + stu[i].gra + ".");
        }
        System.out.print("Total : Grade U = " + uGrade + " " + "Grade S = " + sGrade);
    }
    
}


class Student{
    protected int midsc,fisc,tosc;
    protected String na;
    protected char gra;
    protected Scanner in = new Scanner(System.in);

    void setdata(){
        System.out.print("Enter name : ");
        na = in.nextLine();
        System.out.print("Enter midterm score : ");
        midsc = in.nextInt();
        System.out.print("Enter final score : ");
        fisc = in.nextInt();  
    }

    void calGrade(){}
}

class Undergraduate extends Student{
    private int prosc;

    public void setdata(String na,int mid,int fisc){        
        System.out.print("Enter name : ");
        na = in.nextLine();
        System.out.print("Enter midterm score : ");   
        midsc = in.nextInt();
        System.out.print("Enter final score : ");
        fisc = in.nextInt();
    }   

    public void setProject(){
        System.out.print("Enter project score : ");
        prosc = in.nextInt();
    }

    public void calGrade(){
        tosc = midsc + fisc;
        if (tosc >= 50 && prosc >=50)
            gra = 'S';
        else 
            gra = 'U';
    }
}

class Graduate extends Student{
    private int pubsc;

    public void setdata(){        
        System.out.print("Enter name : ");
        na = in.nextLine();
        System.out.print("Enter midterm score : ");   
        midsc = in.nextInt();
        System.out.print("Enter final score : ");
        fisc = in.nextInt();
    }   

    public void setPublication(){
        System.out.print("Enter project score : ");
        pubsc = in.nextInt();
    }

    public void calGrade(){
        tosc = midsc + fisc;
        if (tosc >= 60 && pubsc >=2)
            gra = 'S';
        else 
            gra = 'U';
    }
}