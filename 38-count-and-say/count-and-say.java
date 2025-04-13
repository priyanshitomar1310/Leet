class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        if(n==2)
        {
            return "11";
        }
        StringBuilder st=new StringBuilder("11");
        for(int i=3;i<=n;i++)
        {
            StringBuilder temp=new StringBuilder("");
            st.append('&');
            int count=1;
            for(int j=1;j<st.length();j++)
            {
                if(st.charAt(j)!=st.charAt(j-1))
                {
                    temp.append(String.valueOf(count));
                    temp.append(st.charAt(j-1));
                    count=1;
                }
                else
                {
                    count++;
                }
            }
            st=temp;
        }
        return st.toString();
    }
}