class Solution {
    public int countPairs(List<Integer> nums, int target) 
    {
        // int i=0,j=nums.size()-1;
        int pairCount=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums.get(i)+nums.get(j)<target)
                {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}