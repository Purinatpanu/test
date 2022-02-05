import java.util.*;
public class Lab07_2_640510676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mtper mt = new mtper();
        wkper wk = new wkper();
        dyper dy = new dyper();
        
        System.out.print("Input Number of monthly employees : ");
        int nm = in.nextInt();
        System.out.println("\n");
        for (int i=0;i<nm;i++){
            mt.setdata(i+1);
            mt.setmt();
            System.out.println("\n");
        }
        System.out.println("...........................................");

        System.out.print("Input Number of weekly employees : ");
        int nw = in.nextInt();
        System.out.println("\n");
        for (int i=0;i<nw;i++){
            wk.setdata(i+1);
            wk.setcom();
            wk.setwk();
            System.out.println("\n");
        }
        System.out.println("...........................................");

        System.out.print("Input Number of daily employees : ");
        int nd = in.nextInt();
        System.out.println("\n");
        for (int i=0;i<nd;i++){
            dy.setdata(i+1);
            dy.setcom();
            dy.setdy();
            System.out.println("\n");
        }

        System.out.println("                            ABC Company                            ");
        printmt(mt);
        printwk(wk);
        printdy(dy);
        in.close();
    }
    static int otwage(mtper mt,int i){
        return mt.mt_ot.get(i)*200;
    }
    
    static int mttotal(mtper mt,int i){
        return mt.mt_sa.get(i) + otwage(mt, i); 
    }

    static int commit(int sale,int per){
        return (sale/100)*per;
    }

    static void printmt(mtper mt){
        int sum_sa = 0;
        int sum_ot = 0;
        System.out.println("Monthly Employee");
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" + "\n","ID","Name","Salary","Overtime wage","Total");
        for (int i=0;i<mt.mt_id.size();i++){
            System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" ,mt.mt_id.get(i),mt.mt_na.get(i),mt.mt_sa.get(i),otwage(mt, i),mttotal(mt, i));
            System.out.println();
            sum_sa += mt.mt_sa.get(i);
            sum_ot += otwage(mt, i);
        }
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" ,"Total","",sum_sa,sum_ot,(sum_sa + sum_ot));
        System.out.println("\n\n");
        
    }

    static void printwk(wkper wk){
        int sum_com = 0;
        int sum_wk = 0;
        System.out.println("Weekly Employee");
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" + "\n","ID","Name","Commission","Overtime wage","Total");
        for (int i=0;i<wk.wk_id.size();i++){
            System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" ,wk.wk_id.get(i),wk.wk_na.get(i),commit(wk.tosa.get(i), wk.c_rat.get(i)),wk.wk_rt.get(i)*wk.wk_ti.get(i),commit(wk.tosa.get(i), wk.c_rat.get(i))+wk.wk_rt.get(i)*wk.wk_ti.get(i));
            System.out.println();
            sum_com += commit(wk.tosa.get(i), wk.c_rat.get(i));
            sum_wk += wk.wk_rt.get(i)*wk.wk_ti.get(i);
        }
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" ,"Total","",sum_com,sum_wk,(sum_com + sum_wk));
        System.out.println("\n\n");
    }

    static void printdy(dyper dy){
        int sum_com = 0;
        int sum_dy = 0;
        System.out.println("Daily Employee");
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" + "\n","ID","Name","Commission","Overtime wage","Total");
        for (int i=0;i<dy.dy_id.size();i++){
            System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" ,dy.dy_id.get(i),dy.dy_na.get(i),commit(dy.tosa.get(i), dy.c_rat.get(i)),dy.dy_rt.get(i)*dy.dy_ti.get(i),commit(dy.tosa.get(i), dy.c_rat.get(i))+dy.dy_rt.get(i)*dy.dy_ti.get(i));
            System.out.println();
            sum_com += commit(dy.tosa.get(i), dy.c_rat.get(i));
            sum_dy += dy.dy_rt.get(i)*dy.dy_ti.get(i);
        }
        System.out.printf("%-5s" + "%-20s" + "%-20s" + "%-20s" + "%-20s" ,"Total","",sum_com,sum_dy,(sum_com + sum_dy));
        System.out.println("\n");
    }
}

class personal {
    protected String id;
    protected String name;
    private Scanner in = new Scanner(System.in);

    public void setdata(int i){
        System.out.println("Input person #" + i);
        System.out.print("Input id : ");
        id = in.nextLine();
        System.out.print("Input name : ");
        name = in.nextLine();
    }
}

class mtper extends personal{
    protected ArrayList<String> mt_na = new ArrayList<String>();
    protected ArrayList<String> mt_id = new ArrayList<String>();
    protected ArrayList<Integer> mt_sa = new ArrayList<Integer>();
    protected ArrayList<Integer> mt_ot = new ArrayList<Integer>();
    private Scanner in = new Scanner(System.in);

    public void setmt(){
        mt_na.add(name);
        mt_id.add(id);
        System.out.print("Input salary : ");
        mt_sa.add(in.nextInt());
        System.out.print("Input overtime period : ");
        mt_ot.add(in.nextInt());
    }
}

class wkper extends comit{
    protected ArrayList<String> wk_na = new ArrayList<String>();
    protected ArrayList<String> wk_id = new ArrayList<String>();
    protected ArrayList<Integer> wk_rt = new ArrayList<Integer>();
    protected ArrayList<Integer> wk_ti = new ArrayList<Integer>();
    private Scanner in = new Scanner(System.in);

    public void setwk(){
        wk_na.add(name);
        wk_id.add(id);
        System.out.print("Input weekly rate : ");
        wk_rt.add(in.nextInt());
        System.out.print("Input working rate : ");
        wk_ti.add(in.nextInt());
    }
}

class dyper extends comit{
    protected ArrayList<String> dy_na = new ArrayList<String>();
    protected ArrayList<String> dy_id = new ArrayList<String>();
    protected ArrayList<Integer> dy_rt = new ArrayList<Integer>();
    protected ArrayList<Integer> dy_ti = new ArrayList<Integer>();
    private Scanner in = new Scanner(System.in);

    public void setdy(){
        dy_na.add(name);
        dy_id.add(id);
        System.out.print("Input daily rate : ");
        dy_rt.add(in.nextInt());
        System.out.print("Input working rate : ");
        dy_ti.add(in.nextInt());
    }
}

class comit extends personal{
    protected ArrayList<Integer> tosa = new ArrayList<Integer>();
    protected ArrayList<Integer> c_rat = new ArrayList<Integer>();
    private Scanner in = new Scanner(System.in);

    public void setcom(){
        System.out.print("Input total sale : ");
        tosa.add(in.nextInt());
        System.out.print("Input percent of commission rate : ");
        c_rat.add(in.nextInt());
    }
}