package Programming.array.I;

import java.util.Scanner;

public class maxNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter " + size + " elements.");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+arr[i]);
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<size; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("max num = " + max);
        System.out.println("max num = " + min);
        sc.close();
    }
}
