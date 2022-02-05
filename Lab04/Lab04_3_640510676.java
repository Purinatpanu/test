import java.util.Scanner;
public class Lab04_3_640510676 {
    public static void main(String[] args) {
        encode text = new encode();
        text.setdata();
        text.calch();
        text.print();
    }
}

class encode{
    private String text;
    private String let;
    private int len;
    private char [] ch; 
    public void setdata(){
        Scanner in = new Scanner(System.in);
        System.out.print("Inter text : ");
        text = in.nextLine();
        len = (int)Math.ceil(text.length()/ (float)3)*3;
        in.close();
    }

    public void calch(){
        ch = new char[len];
        for (int i=0;i<len;i++){
            if (text.length() < len)
                text += ' ';
            ch[i] = (char) ((int) text.charAt(i)+3);
            
        }
    }
    
    public void print(){
        for (int k=0;k<len;k+=3){
            let = new String(ch,k,3);
            let = let.toUpperCase();
            System.out.print(let);
            System.out.print(" ");
        }
    }
}

