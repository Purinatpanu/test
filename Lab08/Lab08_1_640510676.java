import java.util.*;
public class Lab08_1_640510676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of movie DVD: ");
        int nd = in.nextInt();
        System.out.println("\n");
        MovieDVD[] dvd = new MovieDVD[nd];
        
        for (int i=0;i<nd;i++){
            dvd[i] = new MovieDVD();
            dvd[i].setdata();
            System.out.println("\n");
        }
        
        System.out.print("Enter number of E-book: ");
        int ne = in.nextInt();
        System.out.println("\n");
        EBook[] eb = new EBook[ne];
        
        for (int i=0;i<ne;i++){
            eb[i] = new EBook();
            eb[i].setdata();
            System.out.println("\n");
        }

        System.out.print("Enter number of Audiobook: ");
        int na = in.nextInt();
        System.out.println("\n");
        AudioBook[] au = new AudioBook[na];
        
        for (int i=0;i<na;i++){
            au[i] = new AudioBook();
            au[i].setdata();
            System.out.println("\n");
        }
        
        System.out.print("Enter number of orders for today : ");
        int n_or = in.nextInt();
        Order[] or = new Order[n_or];
        for (int i=0;i<n_or;i++){
            or[i] = new Order();
            or[i].setorder(i+1);
            System.out.println("\n");
        }

        in.close();
        checkMovieOrder(dvd, or, n_or);
        checkEbookOrder(eb, or, n_or);
        checkAudiOrder(au, or, n_or);
        printOrder(dvd, eb, au, or);
    }

    static void checkMovieOrder(MovieDVD[] dvd,Order[] or,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<dvd.length;j++){
                if (or[i].isbn.equals(dvd[j].isbn))
                    dvd[j].noor +=1;
            }
        }
    }

    static void checkEbookOrder(EBook[] eb,Order[] or,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<eb.length;j++){
                if (or[i].isbn.equals(eb[j].isbn))
                    eb[j].noor +=1;
            }
        }
    }

    static void checkAudiOrder(AudioBook[] au,Order[] or,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<au.length;j++){
                if (or[i].isbn.equals(au[j].isbn))
                    au[j].noor +=1;
                    if (or[i].inaudi == 'Y' || or[i].inaudi == 'y')
                        au[j].coaudi +=1;
                    else
                        au[j].coaudi +=0;
            }
        }
    }

    static float calpricedvd(int i,MovieDVD[] dvd){
        if (dvd[i].noor != 0)
            return dvd[i].price*dvd[i].noor;
        else
            return 0;
    }

    static float calpriceeb(int i,EBook[] eb){
        if (eb[i].noor != 0)
            return eb[i].price*eb[i].noor;
        else
            return 0;
    }

    static float calpriceaudi(int i,AudioBook[] au,Order[] or){
        if (au[i].noor != 0)
            return (au[i].price*au[i].noor) + (au[i].audipri*au[i].coaudi);
        else 
            return 0;
    }
    
    static void printOrder(MovieDVD[] dvd,EBook[] eb,AudioBook[] au,Order[] or){
        float total =0;
        System.out.println("Daily Order Report\n");
        System.out.printf("%-25s" + "%-30s" + "%-30s" + "%-30s" + "%-30s" +"\n", "ISBN","Director/Author","Narrator","Number of orders","Total Price");
        for (int i=0;i<dvd.length;i++){
            System.out.printf("%-25s" + "%-30s" + "%-30s" + "%-30s" + "%.02f" +"\n", dvd[i].isbn,dvd[i].direc,"-",dvd[i].noor,calpricedvd(i, dvd));
            total += calpricedvd(i, dvd);
        }

        for (int i=0;i<eb.length;i++){
            System.out.printf("%-25s" + "%-30s" + "%-30s" + "%-30s" + "%.02f" +"\n", eb[i].isbn,eb[i].aut,"-",eb[i].noor,calpriceeb(i, eb));
            total += calpriceeb(i, eb);
        }
        
        for (int i=0;i<au.length;i++){
            System.out.printf("%-25s" + "%-30s" + "%-30s" + "%-30s" + "%.02f" +"\n", au[i].isbn,au[i].aut,au[i].nar,au[i].noor,calpriceaudi(i, au,or));           
            total += calpriceaudi(i, au, or);
        }
        System.out.println("\n");
        System.out.printf("Total price = %.02f" ,total);
    }
}

class Order{
    protected int proty;
    protected String isbn;
    protected char inaudi;
    private Scanner in = new Scanner(System.in);

    public void setorder(int i){
        System.out.println("Order #" + i);
        System.out.print("Type of Product : ");
        proty = in.nextInt();
        System.out.print("ISBN : ");
        isbn = in.next();
        if (proty == 3){
            System.out.print("Included Audio? : ");
            inaudi = in.next().charAt(0);
        }
    }
}

class Product {
    protected String isbn;
    protected int price;
    protected int noor = 0;
}

class MovieDVD extends Product {
    protected String direc;
    private Scanner in = new Scanner(System.in);

    public void setdata(){
        System.out.print("ISBN : ");
        isbn = in.nextLine();
        System.out.print("Director : ");
        direc = in.nextLine();
        System.out.print("Price : ");
        price = in.nextInt();
    }
}

class EBook extends Product{
    protected String aut;
    private Scanner in = new Scanner(System.in);

    public void setdata() {
        System.out.print("ISBN : ");
        isbn = in.nextLine();
        System.out.print("Author : ");
        aut = in.nextLine();
        System.out.print("Price : ");
        price = in.nextInt();
    }
}

class AudioBook extends EBook {
    protected String nar;
    protected int audipri;
    protected int coaudi;
    private Scanner in = new Scanner(System.in);
    private Scanner inn = new Scanner(System.in);

    public void setdata() {
        System.out.print("ISBN : ");
        isbn = in.nextLine();
        System.out.print("Author : ");
        aut = in.nextLine();
        System.out.print("Price : ");
        price = inn.nextInt();
        System.out.print("Narrator : ");
        nar = in.nextLine();
        System.out.print("Audio Price : ");
        audipri = inn.nextInt();
    }
}