import java.util.*;

public class vote {
    public static void main(String[] args){
        System.out.println("enter your age");
        @SuppressWarnings("resource")
        Scanner var = new Scanner(System.in);
        int age = var.nextInt();
        if(age>18){
            System.out.println("you are an adult.");
        }else{
            System.out.println("you r not an adult");
        }

    };
}
