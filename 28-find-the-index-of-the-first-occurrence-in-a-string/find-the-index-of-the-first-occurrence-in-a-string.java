class Solution {
    public int strStr(String haystack, String needle) {
        int j,k,f=1;
      for(int i=0;i<=haystack.length()-needle.length();i++)
      {
        f=1;
         for(j=0,k=i;j<needle.length();j++,k++)
         {
            if(haystack.charAt(k)!=needle.charAt(j))
            {
                f=0;
            }
         }
         if(f==1)
         {
            return i;
         }
      }
      return -1;
    }
}