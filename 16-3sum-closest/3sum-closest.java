class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int min=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            sum=0;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if (Math.abs(target - sum) < Math.abs(target - min)) {
                    min = sum;
                }
               if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return min;
    }
}