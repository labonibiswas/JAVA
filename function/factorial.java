package Programming.function;

import java.util.Scanner;

public class factorial {
    public static int fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }

        return f;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number to find factorial: ");
        int n = sc.nextInt();

        System.out.println("factori of " + n + " is " + fact(n));
    }
}
