//Kuyyyyy

import java.util.*;

class Person{
    protected String F_name;
    protected String L_name;
    protected int age;

    Scanner input = new Scanner(System.in);
    public void setData(){
        System.out.print("Input first name: ");
        F_name = input.next();
     // System.out.println();
        System.out.print("Input last name: ");
        L_name = input.next();
        System.out.print("Input age: ");
        age = input.nextInt();
 
    }
}

class Student extends Person{ 
    protected long year;
    protected String [] stuFname = new String[50];
    protected String [] stuLname = new String[50];
    protected int [] stuage = new int[50];
    protected long [] year_arr = new long [50];

    public void CheckStu(int i){
        System.out.print("Input year: ");
        year = input.nextLong();
        stuFname[i] = F_name;
        stuLname[i] = L_name;
        stuage[i] = age;
        year_arr[i] = year;

    }


}

class teacher extends Person{
    protected long salary;
    protected String [] teaFname = new String[50];
    protected String [] teaLname = new String[50];
    protected int [] teaage = new int[50];
    protected long [] salary_arr = new long [50];


    public void CheckTea(int i){
            System.out.print("Input salaly: ");
            salary = input.nextLong();
            teaFname[i] = F_name;
            teaLname[i] = L_name;
            teaage[i] = age;
            salary_arr[i] = salary;
        }
    }

  
public class Lab07_1_640510690 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input N :");
        int N = input.nextInt();
        char typee;
        int countS =0;
        int countT = 0;
        
      
        Student[]  stu = new Student[N];
        teacher[] tea = new teacher[N];


            for(int i= 0; i<N; i++){ //ทำการลูป ตามจำนวน N คน
         
            System.out.print("Input person #"+(i+1)+" (Teacher or Studennt) : ");
            typee = input.next().charAt(0);
            if(typee == 'T' || typee == 't'){ //check type T 
                tea[countT] = new teacher(); //แก้ใน []
                tea[countT].setData();
                tea[countT].CheckTea(i);
                countT +=1;

            }
            if(typee == 'S' || typee == 's'){ //check type S
               
                stu[countS] = new Student();
                stu[countS].setData();
                stu[countS].CheckStu(i);
                countS+=1;
            
            }
            System.out.println();
        }
       // System.out.println(countS);

        //System.out.print(stu[0].F_name);
        printAllStudents(stu);
        input.close();
    }

    static void printAllStudents(  Student[]  stu){
    
        for(int i= 0; i<stu.length;i++){
            System.out.println(stu[i].stuFname[i]);
            System.out.println(stu[i].stuLname[i]);
            System.out.println(stu[i].stuage);
            System.out.println(stu[i].year_arr);
        }
    }


}

    

