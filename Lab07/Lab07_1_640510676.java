import java.util.*;
public class Lab07_1_640510676 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input N : ");
        int n = in.nextInt();
        System.out.println("\n");
        Person peo = new Person();         
        Student stu = new Student();
        Teacher tea = new Teacher();
        
        for (int i=0;i<n;i++){
            peo.setcheck(i);      
            if (peo.getch() == 's' || peo.getch() == 'S'){
                stu.setdata();
                stu.setstudent();
            }
            else if (peo.getch() == 't' || peo.getch() == 'T'){
                tea.setdata();
                tea.settea();
            }
        }
        printAllStudents(stu);    
        printAllTeachers(tea);
        countTeacher(tea,calAndPrintAvgAge(stu, tea));
        in.close();
    }

    static void printAllStudents(Student stu){
        System.out.println("Students");
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-15s" + "%-15s" + "\n","","Firstname","Lastname","Age","Study year");
        for (int i=0;i<stu.st_na.size();i++){
            System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-15s" + "%-15s" ,(i+1),stu.st_na.get(i),stu.st_lna.get(i),stu.st_ag.get(i),stu.st_y.get(i));
            System.out.println();
        }
        System.out.println();
    }
    
    static void printAllTeachers(Teacher tea){
        System.out.println("Teachers");
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-15s" + "%-15s" + "\n","","Firstname","Lastname","Age","Salary");
        for (int i=0;i<tea.te_na.size();i++){
            System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-15s" + "%-15s" ,(i+1),tea.te_na.get(i),tea.te_lna.get(i),tea.te_ag.get(i),tea.te_y.get(i));
            System.out.println();
        }
        System.out.println();
    }

    static double calAndPrintAvgAge(Student stu,Teacher tea){
        float sum = 0;
        for(float d : stu.st_ag)
            sum += d;
        float st_av = sum/stu.st_ag.size();
        System.out.printf("Average of student age = %.2f  \n" ,st_av);
        
        sum = 0;
        for(float d : tea.te_ag)
            sum += d;
        float te_av = sum/tea.te_ag.size();
        System.out.printf("Average of teacher age = %.2f  \n" ,te_av);
        return te_av;
    }

    static void countTeacher(Teacher tea,double te_av){
        int be = 0;
        for (float i : tea.te_ag){
            if (i<te_av)
                be++;
        }
        System.out.print("Number of teachers who have age below average = " + be);
    }

}

class  Person{
    protected char ckst;
    protected String Fname;
    protected String Sname;
    protected int age;
    private Scanner in = new Scanner(System.in);

    public void setdata(){
        System.out.print("Input first name : ");
        Fname = in.next();
        System.out.print("Input last name : ");
        Sname = in.next();
        System.out.print("input age : ");
        age = in.nextInt();
    }

    public void setcheck(int i){
        System.out.print("Input person #" + (i+1) + (" (Teacher or Student) : "));
        ckst = in.next().charAt(0);
    }

    public char getch(){
        return ckst;
    }
}

class Student extends Person{
    protected ArrayList<String> st_na = new ArrayList<String>();
    protected ArrayList<String> st_lna = new ArrayList<String>();
    protected ArrayList<Integer> st_ag= new ArrayList<Integer>();
    protected ArrayList<Integer> st_y = new ArrayList<Integer>();
    private Scanner in = new Scanner(System.in);

    public void setstudent(){
        System.out.print("Input study year : ");
        st_na.add(Fname);
        st_lna.add(Sname);
        st_ag.add(age);
        st_y.add(in.nextInt());
        System.out.println("\n");
    }
}

class Teacher extends Person{ 
    protected ArrayList<String> te_na = new ArrayList<String>();
    protected ArrayList<String> te_lna = new ArrayList<String>();
    protected ArrayList<Integer> te_ag= new ArrayList<Integer>();
    protected ArrayList<Integer> te_y = new ArrayList<Integer>();
    private Scanner in = new Scanner(System.in);

    public void settea(){
        System.out.print("Input salary : ");
        te_na.add(Fname);
        te_lna.add(Sname);
        te_ag.add(age);
        te_y.add(in.nextInt());
        System.out.println("\n");
    }
}