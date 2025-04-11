package Programming.array.I;
import java.util.Scanner;

public class findEle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element to find : ");
        int find = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == find) {
                System.out.println(find + " is presend at index " + i);
            }
        }

        sc.close();
    }
}
