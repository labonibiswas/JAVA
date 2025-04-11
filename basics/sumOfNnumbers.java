import java.util.Scanner;
public class sumOfNnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number of turms:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            
            sum = sum + i;
        
        }
        System.out.println("sum of "+ n +" natural numbers is: " + sum);
        sc.close();
    }
    
}
