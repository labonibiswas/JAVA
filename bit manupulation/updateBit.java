
import java.util.Scanner;

public class updateBit{
    public static void main(String[] args) {
        int n = 4; //0100
        int i = 1;
        int bm = 1<<i;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter operation 0 or 1");
        int oper = sc.nextInt();

        if(oper == 1){
            int newNum = n | bm;
            System.out.println(newNum);
        }else{
            int notbm = ~(bm);
            int newNum = n & notbm;
            System.out.println(newNum);
        }
    }
}