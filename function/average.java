package Programming.function;

import java.util.Scanner;

public class average {

    public static void avg() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (a + b + c) / 3;

        System.out.println("average of the above number is : " + avg);
        sc.close();
    }

    public static void main(String[] args) {
        avg();
    }
}
