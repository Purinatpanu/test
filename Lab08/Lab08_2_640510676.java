import java.util.Scanner;

public class Lab08_2_640510676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of house: ");
        int n = in.nextInt();
        System.out.print("Enter number of lands: ");
        int m = in.nextInt();
        System.out.println("\n");
        LandForHouse[] ho = new LandForHouse[n];
        for (int i=0;i<n;i++){
            ho[i] = new LandForHouse();
            ho[i].setdata(i+1);
            System.out.println("\n");
        }

        LandForSale[] sl = new LandForSale[m];
        for (int i=0;i<m;i++){
            sl[i] = new LandForSale();
            sl[i].setdata(i+1);
            System.out.println("\n");
        }        
        in.close();
        landsaled(ho, sl, n, m);
        print(sl);
        
    }

    static void landsaled(LandForHouse[] ho,LandForSale[] sl,int n,int m){
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (sl[j].landsize >= ho[i].landsize && sl[j].sta != 1 ){
                    sl[j].sale = sl[j].evapri + (sl[j].evapri*0.1) + (ho[i].hpri*0.05);
                    sl[j].sta = 1;
                    break;
                  }
            }
        }
    }

    static void print(LandForSale[] sl){
        double sum = 0;
        System.out.println("Report for lands which can be sold\n");
        System.out.printf("%-20s" + "%-20s" + "\n", "Title deed","Sale price");
        for (int i=0;i<sl.length;i++){
            if (sl[i].sta == 1){
                System.out.printf("%-20s" + "%.02f" + "\n", sl[i].title,sl[i].sale);
                sum += sl[i].sale - sl[i].evapri;
            }
        }
        System.out.println();
        System.out.printf("Total profit = %.02f" ,sum);
        
    }
}

class Land{
    protected int landsize;
    protected Scanner in = new Scanner(System.in);
}

class LandForSale extends Land{
    protected String title;
    protected int evapri;
    protected int sta = 0;
    protected double sale;

    public void setdata(int i){
        System.out.println("Enter data for land #" + i);
        System.out.print("Enter land size: ");
        landsize = in.nextInt();
        System.out.print("Enter title deed: ");
        title = in.next();
        System.out.print("Enter Evaluate price: ");
        evapri = in.nextInt();
    }
}

class LandForHouse extends Land{
    protected int hpri;

    public void setdata(int i){
        System.out.println("Enter data for house #" + i);
        System.out.print("Enter land size: ");
        landsize = in.nextInt();
        System.out.print("Enter house price: ");
        hpri = in.nextInt();
    }
}
