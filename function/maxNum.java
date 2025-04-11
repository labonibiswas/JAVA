package Programming.function;

import java.util.Scanner;

public class maxNum {

    public static void max() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater the " + b);
        } else {
            System.out.println(b + " is greater the " + a);
        }

        sc.close();
    }

    public static void main(String[] args) {
        max();
    }
}
