import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the table: ");
        int num = sc.nextInt();
        for(int i=1; i<11; i++){
            int mul = num * i;
            System.out.println(num + " X " + i + " = " + mul);
        }
        sc.close();
    }
}
