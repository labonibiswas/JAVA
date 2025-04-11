import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("sum of the two number is: " + sum);
        System.out.println("subtraction of the two number is: " + sub);
        System.out.println("multiplication of the two number is: " + mul);
        System.out.println("divition of the two number is: " + div);
        sc.close();
        return;
    }
}
