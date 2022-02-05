import java.util.*;
public class Lab05_4_640510676{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numS,id;
        char op;
        
        in.nextInt();
        numS = in.nextInt();
        
        ArrayList<Integer> cla = new ArrayList<Integer>();
        ArrayList<Integer> stu = new ArrayList<Integer>();
        for(int i = 0;i < numS;i++){
            cla.add(in.nextInt());
            stu.add(in.nextInt());
        }

        MyQueue queue = new MyQueue();

        op = in.next().charAt(0);
        while (op != 'X'){
            if (op == 'E'){
                id = in.nextInt();
                queue.setList(op, id);
            }
            else
                queue.setList(op, 0);
            op = in.next().charAt(0);
        }

        System.out.print("\n");
        queue.enqueue(cla, stu);
        System.out.println("0");
        in.close();
    }
}

class MyQueue{
    private ArrayList<Character> ltCh = new ArrayList<Character>();
    private ArrayList<Integer> ltN = new ArrayList<Integer>();
    private ArrayList<Integer> ltQ = new ArrayList<Integer>();
    private int co,que;

    public void setList(char op,int id){
        ltCh.add(op);
        ltN.add(id);
    }

    public void enqueue(ArrayList<Integer> cla , ArrayList<Integer> stu){
        for(int i = 0;i < ltCh.size();i++){
            if (ltCh.get(i).equals('E')){
                co = 0;
                for (int j = ltQ.size()-1; j >= 0;j--){
                    if (cla.get(stu.indexOf(ltQ.get(j))) == cla.get(stu.indexOf(ltN.get(i))))
                        co = j+1;
                }
                if (co == 0 || co == ltQ.size())
                    ltQ.add(ltN.get(i));
                else
                    ltQ.add(co,ltN.get(i));
            }
            
            else{
                if(ltQ.size() != 0){
                    DQ();
                    System.out.println(que);
                    }
                else
                    System.out.println("empty");
            }
        }
    }

    public void DQ(){
        que = ltQ.get(0);
        ltQ.remove(0);
    }
}