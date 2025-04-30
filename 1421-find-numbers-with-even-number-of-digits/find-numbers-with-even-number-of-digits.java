class Solution {
    public boolean isEven(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        if(count%2==0)
        {
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(isEven(nums[i]))
            {
                count++;
            }
        }
        return count;
    }
}