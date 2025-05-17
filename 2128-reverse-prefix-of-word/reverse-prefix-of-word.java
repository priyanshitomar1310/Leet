class Solution {
    public void  reverse(StringBuilder s,int i,int j)
    {
        while(i<j)
        {
            char temp=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public String reversePrefix(String word, char ch) {
        int i=0;
        int index = word.indexOf(ch); 
        if (index == -1) {
            return word; 
        }
        StringBuilder str = new StringBuilder(word);
        reverse(str, 0, index);
        return str.toString();
    }
}