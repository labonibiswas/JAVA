package Programming.array.I;

public class maxConsOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0;
            }

        }
        return maxcount;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 1, 0, 1, 1, 1 };
        int output = findMaxConsecutiveOnes(arr);
        System.out.println("count of consicutive ones is " + output);
        return;
    }
}
