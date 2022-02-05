import java.util.Scanner;
public class Lab05_3_640510676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu me = new Menu();
        Stack st = new Stack();
        
        while (me.getChoice() != 4){
            me.setChoice();
            if (me.getChoice() == 1){
                if (st.isFull() == false){
                    System.out.print("Enter data : ");
                    int x = in.nextInt();
                    st.push(x);               
                }
                else 
                    st.push(0);
            }
            else if (me.getChoice() == 2){
                st.pop();
            }
            else if (me.getChoice() == 3)
                st.show();
        }
        System.out.println("Bye bye");
    in.close();
    }
}

class Menu{
    private int cho;
    private Scanner in = new Scanner(System.in);

    public void setChoice(){
        System.out.print("**********" + "\n" +
        "1.push" + "\n" +
        "2.pop" + "\n" +
        "3.show" + "\n" +
        "4.exit" + "\n" +
        "**********" + "\n" + 
        "Please select choice : ");
        cho = in.nextInt();
    }

    public int getChoice(){
        return cho;
    }
}

class Stack{
    private int[] item = new int[5+1];
    private int top,pop;

    public Stack(){
        top = -1;
    }
    
    public void push(int x){
        if (!isFull()){
            top += 1;
            item[top] = x;
            }
        else{
            System.out.println("่Stack is full");
            System.out.println("\n");
        }
    }

    public void pop(){
        if (!isEmpty()){
            pop = item[top];
            item[top] = item[top+1];
            top -= 1;
            System.out.println("pop " + pop);
            System.out.println("\n");
        }
        else{
            System.out.println("Stack is empty");
            System.out.println("\n");
        }
    }

    public void show(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            System.out.println("\n");
            }
        else {
            for (int i:item){
                if (i !=0)
                    System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("\n");
        }
    }
    
    public Boolean isEmpty(){
        if (item[0] == item[5])
            return true;
        else
            return false;
    }

    public Boolean isFull(){
        if (item[4] != item[5])
            return true;
        else
            return false;
    }
}