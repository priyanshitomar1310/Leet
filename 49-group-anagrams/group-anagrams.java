class Solution {
    public boolean isAnagram(String s1,String s2)
    {
        if (s1.length() != s2.length()) 
        return false;
        int[] count1=new int[256];
        int[] count2=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }
        return Arrays.equals(count1, count2);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> mainList=new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            if (visited[i]) continue;
            List<String> row=new ArrayList<>();
            row.add(strs[i]);
            visited[i] = true;
            for(int j=i+1;j<strs.length;j++)
            {
                if(isAnagram(strs[i],strs[j]))
                {
                    
                    row.add(strs[j]);
                    visited[j] = true;
                }
            }
            mainList.add(row);
        }
        return mainList;
    }
}