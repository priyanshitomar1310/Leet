class Solution {
    public boolean isCapital(char ch)
    {
        return ch>='A' && ch<='Z';
    }
    public boolean detectCapitalUse(String word) {
        int count=0;
        
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
           if(isCapital(ch))
           count++;
        }
          return count == word.length() || 
               count == 0 || 
               (count == 1 && isCapital(word.charAt(0)));
    }
}