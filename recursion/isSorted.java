//check if the array is sorted (strickly increasing)

public class isSorted{
    public static boolean checkSorting(int arr[], int idx){

        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return checkSorting(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4}; 
        boolean result = checkSorting(arr,0);
        System.out.println(result);
    }
}