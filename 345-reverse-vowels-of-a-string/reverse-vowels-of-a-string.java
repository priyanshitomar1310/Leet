class Solution {
    public boolean isVowel(char c)
    {
        if("AEIOU".indexOf(c)!=-1||"aeiou".indexOf(c)!=-1)
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder str=new StringBuilder(s);
       int i=0,j=s.length()-1; 
       while(i<j)
       {
           char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (!isVowel(ch1)) {
                i++;
            } else if (!isVowel(ch2)) {
                j--;
            } else {
                str.setCharAt(i, ch2);
                str.setCharAt(j, ch1);
                i++;
                j--;
            }
          
       }
       return str.toString();
    }
}