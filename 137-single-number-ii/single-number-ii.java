import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 3) {
            if (i + 1 >= nums.length || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1; 
    }
}
