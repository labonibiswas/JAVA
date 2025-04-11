import java.util.Scanner;
public class month {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the month: ");
        int num = sc.nextInt();
        switch(num){
            case 1 :
                System.out.println("month name is january");
                break;
            case 2 :
                System.out.println("month name is february");
                break;   
            case 3 :
                System.out.println("month name is march");
                break;  
            case 4 :
                System.out.println("month name is april");
                break;
            case 5 :
                System.out.println("month name is may");
                break;
            case 6 :
                System.out.println("month name is june");
                break;
            case 7 :
                System.out.println("month name is july");
                break;
            case 8 :
                System.out.println("month name is august");
                break;
            case 9 :
                System.out.println("month name is september");
                break;
            case 10 :
                System.out.println("month name is october");
                break;
            case 11 :
                System.out.println("month name is november");
                break;
            case 12 :
                System.out.println("month name is december");
                break;
            default :
                System.out.println("invalid");    
        }
        sc.close();
    }
}
