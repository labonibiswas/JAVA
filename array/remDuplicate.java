class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == 0){
            return 0;
        }
        int k=1;
        for(int i=0; i<nums.length; i++){
                if(nums[i] != nums[k-1]){
                    nums[k] = nums[i];
                    k++;
                }
        }
        
    return k;
    }
}

public class remDuplicate{
    public static void main(String arg[]){
        Solution solution = new remDuplicate();
        int[] nums= {11,11,22,99,55,55};
        int k = solution.remDuplicate(nums);

        for(int i = 0; i<k; i++){
            System.out.print(num[i] + " ");
        }
    }
}

