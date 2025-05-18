class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] chars1=new int[256];
        int[] chars2=new int[256];
        Arrays.fill(chars1,0);
        Arrays.fill(chars2,0);
        for(int i=0;i<s.length();i++)
        {
            if (chars1[s.charAt(i)] != chars2[t.charAt(i)]) {
                return false;
            }
            chars1[s.charAt(i)] = i + 1;
            chars2[t.charAt(i)] = i + 1;
        }
        
        return true;
    }
}