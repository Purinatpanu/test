import java.util.Scanner;
public class Lab06_3_640510676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N : ");
        int n = in.nextInt();
        
        act[] nu = new act[n];
        for (int i=0;i<n;i++){
            nu[i] = new act();
            nu[i].setdata(i);
            nu[i].getname();
            nu[i].getmstar();
            nu[i].getfstar();
        }
        checkAndPrintVote(n, nu);
        in.close();
    }

    static void checkAndPrintVote(int n, act[] nu){
        int[] vms = new int[3];
        int[] vfs = new int[3];
        int maxm = 0;
        int maxf = 0;
        int mpos = 0,fpos = 0;
        String tm = new String();
        String tf = new String();

        for (int j=0;j<n;j++){
            if (nu[j].getmstar() == 1)
                vms[0] +=1;
            else if (nu[j].getmstar() == 2)
                vms[1] +=1;
            else if (nu[j].getmstar() == 3)
                vms[2] +=1;

            if (nu[j].getfstar() == 1)
                vfs[0] +=1;
            else if (nu[j].getfstar() == 2)
                vfs[1] +=1;
            else if (nu[j].getfstar() == 3)
                vfs[2] +=1;   
        }

        for (int i=0;i<vms.length;i++){
            if (vms[i] > maxm){
                maxm = vms[i];
                mpos = i;
            }
        }

        for (int j=0;j<vfs.length;j++){
            if (vfs[j] > maxf){
                maxf = vfs[j];
                fpos = j;
            }
        }


        switch (mpos){
            case 0:
                tm = "Nadech";
                break;
            case 1:
                tm = "Wier";
                break;
            case 2:
                tm = "Mario";
                break;
        }

        switch (fpos){
            case 0:
                tf = "Aum";
                break;
            case 1:
                tf = "Yaya";
                break;
            case 2:
                tf = "Bella";
                break;
        }
        System.out.println("Top star award (Actor) goes to " + tm);
        System.out.println("Top star award (Actress) goes to " + tf);
        printGoodLuckPeople(n, mpos, fpos, nu);
    }

    static void printGoodLuckPeople(int n,int mpos,int fpos,act[] nu){
        System.out.print("Good luck voter -> ");
        for (int i=0;i<n;i++){
            if (nu[i].getmstar() == mpos+1 && nu[i].getfstar() == fpos+1)
                System.out.print(nu[i].getname() + " ");
        }
    }
}

class act{
    private Scanner in = new Scanner(System.in);
    private String na;
    private int ms,fs;

    public void setdata(int i){
        System.out.println("Input votes#" + (i+1));
        System.out.print("Input name : ");
        na = in.next();
        System.out.print("Input number of actor and number of actress : ");
        ms = in.nextInt();
        fs = in.nextInt();
        System.out.println("\n");
    }

    public String getname(){
        return na;
    }

    public int getmstar(){
        return ms;
    }

    public int getfstar(){
        return fs;
    }
}