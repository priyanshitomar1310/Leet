class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(i<nums.length)
        {
            if(j<nums.length &&nums[i]!=nums[j])
            {
                int temp=nums[i];
                j++;
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i++;
        }
        return j+1;
    }
}