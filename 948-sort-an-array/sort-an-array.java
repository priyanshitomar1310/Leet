class Solution {
    public int[] sortArray(int[] nums) {
       PriorityQueue<Integer> p=new PriorityQueue<>();
       for(int val:nums)
       {
         p.add(val);
       }
       for(int i=0;i<nums.length;i++)
       {
          nums[i]=p.peek();
          p.remove();
       }
       return nums;
    }
}