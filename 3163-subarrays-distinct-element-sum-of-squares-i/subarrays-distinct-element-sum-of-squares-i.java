class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) 
        {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < nums.size(); j++)
            {
                map.put(nums.get(j), map.getOrDefault(nums.get(j), 0) + 1);
                int distinct = map.size();
                sum += distinct * distinct;
            }
        }
        return sum;
    }
}