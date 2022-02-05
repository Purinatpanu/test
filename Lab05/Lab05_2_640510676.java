import java.util.Scanner;
public class Lab05_2_640510676 {
    public static void main(String[] args) {
    new box("SizeA",14,20,6);   //ถ้าใช้ ิ  box A = new box("SizeA",14,20,6); ใน vs จะขึ้นแจ้งเตือนครับเลยขอเขียนแบบนี้เห็นแล้วไม่สบายใจครับ
    new box();                  //อันนี้ก็เหมือนกันครับ(ใน vs จะขึ้นแจ้งเตือนสีเหลืองครับปิดโค๊ดข้อนี้ไปก็จะมีแจ้งเตือนอยู่ดีครับ)
    
    }
}

class box{
    private float wid,len,hei;
    private float vol;
    private String name;
    private Scanner in = new Scanner(System.in);

    public box(String a,float w,float l,float h){
        name = a;
        wid = w;
        len = l;
        hei = h;
        System.out.println("Hello from 1st constructor");
        calVolume();
        System.out.println();
        System.out.println();
    }

    public box(){
        System.out.println("Hello from 2st constructor");
        setdata();
        calVolume();
    }

    public void setdata(){
        System.out.print("Input Name of Box: ");
        name = in.next();
        System.out.print("Inter Width: ");
        wid = in.nextFloat();
        System.out.print("Inter Length: ");
        len = in.nextFloat();
        System.out.print("Inter Heigth: ");
        hei = in.nextFloat();
    }

    public void calVolume(){
        vol = wid * len * hei;
        System.out.println("The Volume of Box: " + name + " = " + vol);
    }
}