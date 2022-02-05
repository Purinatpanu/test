import java.util.Scanner;
public class Lab06_2_640510676 {
    public static void main(String[] args) {
        Hum [] hu = new Hum[3];
        for (int i=0;i<2;i++){
            hu[i] = new Hum();
            hu[i].setdata(i+1);
            hu[i].getname();
            hu[i].getsex();
            hu[i].getheight();
            hu[i].getweight();
        }
        
        calhum(hu);
    }

    static void calhum(Hum[] hu){
        int[] abw = new int[2];

        for (int j=0;j<2;j++){
            if (hu[j].getsex() == 'F'){ 
                abw[j] = Math.abs((hu[j].getheight()-110)-hu[j].getweight());
            }
            else if(hu[j].getsex() == 'M'){
                abw[j] = (Math.abs((hu[j].getheight()-100)-hu[j].getweight()));
            }
        }

        if (abw[0] > abw[1])
            System.out.printf("Weight of %s is closer to standard weight than %s." ,hu[1].getname(),hu[0].getname());
        else if (abw[0] < abw[1])
            System.out.printf("Weight of %s is closer to standard weight than %s." ,hu[0].getname(),hu[1].getname());
        else
            System.out.println("The weight of both of them are close to the standard weight equally.");
    }
}

class Hum{
    private Scanner in = new Scanner(System.in);
    private String na;
    private int hei;
    private int wei;
    private char se;

    public void setdata(int i){
        System.out.println("Input data for person#" + i);
        System.out.print("Input name: ");
        na = in.next();
        System.out.print("Input height: ");
        hei = in.nextInt();
        System.out.print("Input weight: ");
        wei = in.nextInt();
        System.out.print("Input sex: ");
        se = in.next().charAt(0);
        System.out.println();
        System.out.println();
    }

    public String getname(){
        return na;
    }

    public char getsex(){
        return se;
    }

    public int getheight(){
        return hei;
    }

    public int getweight(){
        return wei;
    }
}