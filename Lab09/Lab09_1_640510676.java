/* 
640510676
ภูริณัฐ ภาณุพงศ์สกุล
*/

import java.util.*;
public class Lab09_1_640510676 {
    public static void main(String[] args) {
        Order or = new Order();
        or.setData();
        or.showData();
    }
}

class OrderItem {
    private String f_name;
    protected int pri;
    protected int no_dish;
    protected Scanner in = new Scanner(System.in);

    public void setData(){
        System.out.print("Enter Food name : ");
        f_name = in.nextLine();
        System.out.print("Enter price : ");
        pri = in.nextInt();
        System.out.print("Enter number of dishes : ");
        no_dish = in.nextInt();
        System.out.println("\n" + "*******************************************************" + "\n");
    }

    public void showData(){
        System.out.printf("%-20s" + "%-20s" + "%-10s" + "\n", f_name,pri,no_dish);
    }
}

class Order {
    private String or_id;
    private String tb_no;
    private int no_it;
    private OrderItem [] or_it = new OrderItem[10];
    private double to_pri;
    private Scanner in = new Scanner(System.in);

    public void setData(){
        System.out.print("Enter order ID : ");
        or_id = in.nextLine();
        System.out.print("Enter Table No. : ");
        tb_no = in.nextLine();
        System.out.print("Enter number of food items : ");
        no_it = in.nextInt();
        System.out.println("\n" + "*******************************************************" + "\n");
 
        for(int i = 0; i<no_it; i++){
            or_it[i] = new OrderItem();
            or_it[i].setData(); 
        }
    }

    public void showData(){
        System.out.printf("Order ID - " + "%-9s" + "Table No. - " + "%-5s" + "\n", or_id, tb_no);
        System.out.printf("%-20s" + "%-20s" + "%-5s" + "\n" , "Food Name", "Price/Dish(Bath)", "QTY");
        
        for(int i=0;i<no_it;i++){
            or_it[i].showData();
        }
        for(int i=0;i<no_it;i++){
            to_pri += or_it[i].pri * or_it[i].no_dish;
        }
        System.out.printf("Total Price = " + "%.0f" + " Bath", to_pri);
    }
}

