import java.util.*;

class fibonacci{

    public static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of terms ");
        int n = sc.nextInt();
        System.out.print(" fibonacci series is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}


/*class fibonacci{

    public static void fibonacci(int a, int b, int n) {
        
        if(n == 0)
            return ;

        System.out.print(a + " ");
        fibonacci(b, a+b, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms ");
        int n = sc.nextInt();
        fibonacci(0, 1, n);
        sc.close();
    }
}*/