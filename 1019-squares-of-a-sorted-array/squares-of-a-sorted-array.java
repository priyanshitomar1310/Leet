class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            if(i==j)
            {
                nums[j]=nums[j]*nums[j];
            }
            else
            {
                nums[i]=nums[i]*nums[i];
                nums[j]=nums[j]*nums[j];
            }
            i++;
            j--;
        }
        Arrays.sort(nums);
        return nums;
    }
}