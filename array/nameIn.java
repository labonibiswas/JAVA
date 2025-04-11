package Programming.array.I;

import java.util.Scanner;

public class nameIn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the array: ");
        int size = sc.nextInt();

        String arr[] = new String[size];
        System.out.println("enter " + size + " names: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        System.out.print("array of names : ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        sc.close();
    }
}
