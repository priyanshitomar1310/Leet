class Solution {
    public int isExists(int n,int[] nums)
    {
        int i = -1;
       for (int j = 0; j < nums.length; j++)
      {
        if (nums[j] == n) 
        {
            i = j;
            break;
        }
      }
      if (i == -1) {
        return -1;
       }
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] > n) {
            return nums[j];
        }
    }
    return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=isExists(nums1[i],nums2);
        }
        return arr;
    }
}