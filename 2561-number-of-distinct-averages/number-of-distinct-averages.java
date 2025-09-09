class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set=new HashSet<>();
        int i=0,j=nums.length-1;
        while(i<j)
        {
            int min=nums[i];
            int max=nums[j];
            double avg=(double)(min+max)/2;
            set.add(avg);
            if(min==max)
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
        }
        return set.size();
    }
}