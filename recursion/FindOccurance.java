//find the 1st and last occurance of an element in the string.

public class FindOccurance{
    public static int firstOcc = -1;
    public static int lastOcc = -1;
    public static void occurance(String str, int idx, char element){

        if(idx == str.length()-1){
            System.out.println(firstOcc);
            System.out.println(lastOcc);
            return;
        }

        char currentEle = str.charAt(idx);
        if(currentEle == element){
            if(firstOcc == -1){
                firstOcc = idx;
            }else{
                lastOcc = idx;
            }
        }

        occurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abbccaaadn";
        occurance(str, 0, 'a');
    }
}