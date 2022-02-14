import java.util.Scanner;
@SuppressWarnings("unchecked")
public class Lab11_2_640510676 {
    public static <T> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N : ");
        int x = in.nextInt();
        Queue <T> qu = new Queue<T>(x);
        int sel;
        System.out.print("Select int or char (i or c): ");
        char ch = in.next().charAt(0);
        
        do{
            System.out.println("*******************************************************");
            System.out.println("            1)  enqueue");
            System.out.println("            2)  dequeue");
            System.out.println("            3)  show");
            System.out.println("            4)  exit");
            System.out.print("Select choice : ");
            sel =  in.nextInt();
            
            T v;
            if (ch == 'c'){
                
                if (sel == 1){
                    if (!qu.isFull()){
                        System.out.print("Input data for enqueue : ");
                        v = (T)(Character) in.next().charAt(0);
                        qu.enqueue(v);
                        System.out.println("OK\n");
                    }
                    else {
                        System.out.println("Queue is full." + "\n");
                    }
                }
                else if (sel == 2){
                    if (!qu.isEmpty())
                        System.out.println(qu.dequeue() + "\n");
                    else 
                        System.out.println("Queue is empty." + "\n");
                }
                else if (sel == 3){
                    if (qu.isEmpty())
                        System.out.println("Nothing to show." + "\n");
                    else
                        qu.show();
                }
                else if (sel == 4){
                    System.out.println("Bye.");
                }
            }
            else if (ch == 'i'){
                if (sel == 1){
                    v = (T)(Integer) in.nextInt();
                    System.out.print("Input data for enqueue : ");
                    qu.enqueue(v);
                    System.out.println("OK\n");
                }
                else if (sel == 2){
                    qu.dequeue();
                }
                else if (sel == 3){
                    qu.show();
                }
                else if (sel == 4){
                    System.out.println("Bye.\n");
                }
            }

        }
        while (sel != 4);
        in.close();
    }
   
}

@SuppressWarnings("unchecked")
class Queue <T>{
    private int n;
    private int front,rear,count;
    private Object [] item;
    private T Qfront;

    Queue(int x) { 
        n = x;
        item = new Object[n];
        front=0;
        rear=-1;
        count=0;
    }
       
    public void enqueue(T v) { 
        if (rear < n-1) { 
            rear++ ;
            item[rear] = v;
            count++ ;
            }
    }
    
    T dequeue(){
        if (!isEmpty()){
            Qfront = (T)item[front];
            front++;
            count--;
        }
        return Qfront;
    }

    public void show(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                System.out.println("\n");
                }
            else {
                for (int i=front;i<=rear;i++){
                    System.out.print(item[i] + " ");
                   
                }
                System.out.println();
            }
    }
    

    public Boolean isEmpty(){
        if (count <= 0)
            return true;
        else
            return false;
    }

    public Boolean isFull(){
        if (rear < n-1)
            return false;
        else 
            return true;
    }

}