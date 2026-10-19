class Solution {
    public int countPairs(List<Integer> nums, int target) 
    {
        int i=0,j=nums.size()-1;
        int pairCount=0;
        Collections.sort(nums);
        while(i<=j)
        {
            if((nums.get(i)+nums.get(j))<target)
            {
                pairCount+=j-i;
                i++;
            }
            else if((nums.get(i)+nums.get(j))>=target)
            {
                j--;
            }
        }
        return pairCount;
    }
}