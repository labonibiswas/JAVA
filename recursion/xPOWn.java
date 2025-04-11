import java.util.*;

class xPOWn{

    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }else if(x == 0){
            return 0;
        }

        int x_ = pow(x, n-1);
        int xn = x * x_;
        return xn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the base number: ");
        int x = sc.nextInt();

        System.out.print("enter the exponantial number: ");
        int n = sc.nextInt();

        int output = pow(x,n);
        System.out.println(output);
    }
}