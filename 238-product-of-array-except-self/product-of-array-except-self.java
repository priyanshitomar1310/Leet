class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        int suffix=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]*nums[i];
        }
        prefix[nums.length-1]=prefix[nums.length-2];
        for(int i=nums.length-2;i>0;i--)
        {
            prefix[i]=suffix*prefix[i-1];
            suffix*=nums[i];
        }
        prefix[0]=suffix;
        return prefix;
    }
}