class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<i+nums.length;j++)
            {
                int index = j % nums.length;
                if(nums[index]>nums[i])
                {
                    arr[i]=nums[index];
                    k++;
                    break;
                }
                
            }
            
        }
       return arr;
    }
}