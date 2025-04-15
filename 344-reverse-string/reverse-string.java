class Solution {
    public void reverseString(char[] s) {
        char temp;
        int i=0,e=s.length-1;
        while(i<e)
        {
            temp=s[i];
            s[i]=s[e];
            s[e]=temp;
            i++;
            e--;
        }
        
    }
}