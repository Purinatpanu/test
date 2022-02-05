/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/
import java.util.*;
public class Lab01_4_640510676 {
    public static void main(String[] args){
        //int[] a = new int[5];
        //int[] b = new int[5];
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> co = new ArrayList<Integer>();
        Set<Integer> s = new HashSet<Integer>();
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array A ");
        in.close(); //ลบออกเอานะ
        for(i = 0;i<=4;i++){
            c.add(in.nextInt());
        }
        System.out.println("Enter Array B ");
        for(i = 0;i<=4;i++){
            c.add(in.nextInt());
            }
         
        Collections.sort(c);
        for(int j:c){
            if (s.add(j) == false)
                co.add(j);
            }
        for(int k:c){
            System.out.print(k+ " ");
        System.out.println();
        }
        if (co.size()>0){          
            for(int l:co){
                System.out.print(l+ " ");
                }
            }
        else
        System.out.println("-");
        
        
    }
}