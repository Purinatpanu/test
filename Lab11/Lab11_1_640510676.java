@SuppressWarnings("unchecked")
public class Lab11_1_640510676 {
    public static void main(String[] args) {
    
    System.out.println(getCenter(8,3,1));
    System.out.println(getCenter('x','a','c'));
    System.out.println(getCenter(1.8,4.9,2.5));    
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

