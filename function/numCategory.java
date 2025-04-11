package Programming.function;

import java.util.Scanner;

public class numCategory {
    public static void main(String[] args) {

        int pCount = 0, Ncount = 0, Zcount = 0;
        char ch;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter a number:");
            int n = sc.nextInt();
            if (n > 0) {
                pCount++;
            } else if (n < 0) {
                Ncount++;
            } else {
                Zcount++;
            }

            System.out.print("Do you want to continue. (y/N)");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        System.out.println("positive count is " + pCount);
        System.out.println("nagative count is " + Ncount);
        System.out.println("zero count is " + Zcount);

        sc.close();

        return;
    }
}
