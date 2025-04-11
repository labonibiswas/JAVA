import java.util.Scanner;

public class InMatrixFindEle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows of the matrix: ");
        int r = sc.nextInt();
        System.out.print("enter the number of columns of the matrix: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.print("enter the elements of the matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter the element to find: ");
        int x = sc.nextInt();

        boolean found = false;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == x){
                    System.out.print("index of the element is : " + i +" "+ j);
                    found = true;
                }
            }
        }

        if(!found){
            System.out.print("element not found");
        }
        
        sc.close();
    }
}