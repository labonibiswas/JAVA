//Q. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class lenOfArrStr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        System.out.print("enter the elements of the array: ");
        int len = 0;
        for(int i=0; i<size; i++){
            arr[i] = sc.next();
            len += arr[i].length();
        }

        System.out.print(len);
    }
}