class Solution {
    public void reverse(StringBuilder st,int start,int end)
    {
        if(start>end)
        {
            return;
        }
        char temp;
        while(start<end)
        {
            temp=st.charAt(start);
            st.setCharAt(start,st.charAt(end));
            st.setCharAt(end,temp);
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " "); 
        StringBuilder st=new StringBuilder(s);
        int start=0;
       for(int i=0;i<=st.length();i++)
       {
          if(i==st.length() || st.charAt(i)==' ')
          {
            reverse(st,start,i-1);
            start=i+1;
          }
       }
       reverse(st,0,st.length()-1);
       return st.toString();
    }
}