class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;

        for (int i=0 ;i<nums.length;i++) {
            int left = 0, right = size;

            while (left < right) {
                int mid = (left + right) / 2;
                if (tails[mid] < nums[i]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            tails[left] = nums[i];
            if (left == size) size++;
        }

        return size;
    }
}
