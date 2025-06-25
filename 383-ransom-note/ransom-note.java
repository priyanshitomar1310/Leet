class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
        return false;
        int[] char1=new int[256];
        int[] char2=new int[256];
        for(int i=0;i<ransomNote.length();i++)
        {
            char1[ransomNote.charAt(i)]++;
        }
        for(int i=0;i<magazine.length();i++)
        {
            char2[magazine.charAt(i)]++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(char1[ransomNote.charAt(i)]>char2[ransomNote.charAt(i)])
            {
                return false;
            }
        }
        return true;
    }
}