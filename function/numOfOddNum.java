package Programming.function;

import java.util.Scanner;

public class numOfOddNum {

    public static void oddSum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of term: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.print("sum of odd number upto " + n + "terms is " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        oddSum();
    }
}
