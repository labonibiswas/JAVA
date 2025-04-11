import java.util.*;
public class inputMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("enter 1 to input marks and enter 0 to exit: ");
            n = sc.nextInt();
            if(n==1){
                System.out.println("enter marks out of 100:");
                int marks = sc.nextInt();
                if(marks >= 90 ){
                    System.out.println("This is Good");
                }
                else if(marks >= 60 ){
                    System.out.println("This is also Good");
                }
                else if(marks >= 0 ){
                    System.out.println("This is Good as well");
                }else{
                    System.out.println("invalid input enter 1 or 0");
                }
            }
        }while (n!=0);
        System.out.println("the program ends here...");
    sc.close();
    }
}
