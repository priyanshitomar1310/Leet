import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums); 
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) 
            continue;
            if (i > 0 && nums[i] == nums[i - 1]) 
            continue;
            if (nums[i] != count) {
                return count;
            }
            count++;
        }
        return count;
    }
}
