package Programming.function;

import java.util.Scanner;
//import java.math.*;

public class XtoThePoweN {

    public static void Power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number x :");
        int x = sc.nextInt();
        System.out.print("enter number n : ");
        int n = sc.nextInt();

        double pow = Math.pow(x, n);

        System.out.println(" x to the power n is : " + pow);

        sc.close();
    }

    public static void main(String[] args) {
        Power();
    }
}
