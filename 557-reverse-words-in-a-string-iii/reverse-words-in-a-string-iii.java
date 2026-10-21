class Solution {
    public String reverse(String s)
    {
        StringBuilder str=new StringBuilder(s);
        int i=0,j=str.length()-1;
        while(i<j)
        {
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
       return str.toString();
    }
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder("");
        int i=0,j=0;
        while(j<s.length())
        {
            if(j<s.length()-1 && s.charAt(j)==' ')
            {
                str.append(reverse(s.substring(i, j)));
                str.append(' ');
                j++;
                i=j;
            }
            else
            {
                j++;
            }
        }
        str.append(reverse(s.substring(i, j)));
        return str.toString();
    }
}