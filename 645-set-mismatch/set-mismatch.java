class Solution {
    public boolean isExists(int[] a,int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                return true;
            }
        }
        return false;
    }
    public int[] findErrorNums(int[] nums) {
        int[] a=new int[2];
        for(int i=1;i<=nums.length;i++)
        {
            if(!isExists(nums,i))
            {
                a[1]=i;
                break;
            }
        }
        Arrays.sort(nums);
        int curr=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[curr])
            {
                curr=i;
            }
            else
            {
                a[0]=nums[curr];
                break;
            }
        }
        return a;
    }
}