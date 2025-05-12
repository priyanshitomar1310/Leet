class Solution {
    public boolean isExist(String[] s,char c,int i)
    {
         for(int j=0;j<s.length;j++)
         {
            if(i >= s[j].length() ||c!=s[j].charAt(i))
            {
                return false;
            }
         }
         return true;
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) 
        return "";
        StringBuilder s=new StringBuilder("");
        int n = Integer.MAX_VALUE;
        for (String str : strs) {
            n = Math.min(n, str.length());
        }
        for(int i=0;i<n;i++)
        {
            if(isExist(strs,strs[0].charAt(i),i))
            {
                s.append(strs[0].charAt(i));
            }
            else
            {
                break;
            }
        } 
        return s.toString();   
    }
}