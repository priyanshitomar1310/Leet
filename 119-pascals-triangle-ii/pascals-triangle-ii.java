class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> mainList=new ArrayList<>();
        List<Integer> finalList=new ArrayList<>();
        int count=0;
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> list=new ArrayList<>();
            count++;
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    list.add(1); 
                }
                else
                {
                    int temp= mainList.get(i-1).get(j-1) + mainList.get(i-1).get(j);
                    list.add(temp);
                }
            }
            mainList.add(list);
        }
        finalList = mainList.get(rowIndex);
        return finalList;

    }
}