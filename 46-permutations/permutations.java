class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> row = new ArrayList<>();

            for (List<Integer> list : mainList) {
                for (int j = 0; j <= list.size(); j++) {
                    List<Integer> temp = new ArrayList<>(list);
                    temp.add(j, nums[i]);  
                    row.add(temp);
                }
            }
            mainList = row;
        }
        return mainList;
    }
}
