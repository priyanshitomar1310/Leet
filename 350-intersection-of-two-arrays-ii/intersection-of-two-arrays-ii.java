class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        while(i<nums1.length)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
            i++;
        }
        i=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<nums2.length)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
            i++;
        }
        int[] arr=new int[list.size()];
        for(i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}