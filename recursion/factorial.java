import java.util.*;

class factorial{

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number to calculate factorial: ");
        int n = sc.nextInt();
        System.out.println("factorial of " + n + " is " + factorial(n));

        sc.close();
    }

    
}