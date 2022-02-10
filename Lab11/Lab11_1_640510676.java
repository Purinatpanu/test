import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Lab11_1_640510676 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 3 integer numbers");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    
    System.out.println("Enter 3 characters");
    char d = in.next().charAt(0);
    char e = in.next().charAt(0);
    char f = in.next().charAt(0);

    System.out.println("Enter 3 float numbers");
    float g = in.nextFloat();
    float h = in.nextFloat();
    float i = in.nextFloat();

    System.out.println();
    System.out.println(getCenter(a,b,c));
    System.out.println(getCenter(d,e,f));
    System.out.println(getCenter(g,h,i)); 
    in.close();   
    }
    
    public static <T extends Comparable<T>> T getCenter(T a, T b,T c){
        T center = (T)(Integer)(0);
        if (a.getClass() == Integer.class){
            if (a.compareTo(b) > 0 && b.compareTo(c) > 0)
                center = b;
            else if (b.compareTo(a) > 0 && a.compareTo(c)> 0)
                center = a;
            else if (a.compareTo(c) > 0 && c.compareTo(b)> 0)
                center = c;
        }
        else if (a.getClass() == Character.class){
            center = (T)(Character)(' ');
            if (a.compareTo(b) > 0 && b.compareTo(c) > 0)
                center = b;
            else if (b.compareTo(a) > 0 && a.compareTo(c)> 0)
                center = a;
            else if (a.compareTo(c) > 0 && c.compareTo(b)> 0)
                center = c;
        }
        else {
            center =(T)(Float)(0f);
            if (a.compareTo(b) < 0 && b.compareTo(c) < 0)
                center = b;
            else if (b.compareTo(a) < 0 && a.compareTo(c) < 0)
                center = a;
            else if (a.compareTo(c) < 0 && c.compareTo(b)< 0)
                center = c;
            else if (a.compareTo(b) > 0 && b.compareTo(c) > 0)
                center = b;
            else if (b.compareTo(a) > 0 && a.compareTo(c) > 0)
                center = a;
            else if (a.compareTo(c) > 0 && c.compareTo(b) > 0)
                center = c;    
        }
        return center;
    }
}

