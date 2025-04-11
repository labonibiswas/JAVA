import java.util.*;

class sumOfNnumbers{

    public static int sum(int n){
        if(n == 0){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number of terms: ");
        int n = sc.nextInt();

        int total = sum(n);
        System.out.println("sum of first " + n + " natural numbers is " + total);

        sc.close();
    }

    
}