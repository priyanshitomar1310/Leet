class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        char[] ct=new char[256];
        char[] cp=new char[256];
        for(int i=0;i<256;i++)
        {
            ct[i]=0;
            cp[i]=0;
        }
        for(int i=0;i<s1.length();i++)
        {
            ct[s2.charAt(i)]++;
            
        }
        for(int i=0;i<s1.length();i++)
        {
            cp[s1.charAt(i)]++;
        }
        if(Arrays.equals(ct, cp))
            {
                return true;
            }
        for(int i=s1.length();i<s2.length();i++){    
            ct[s2.charAt(i)]++;
            ct[s2.charAt(i-s1.length())]--;
             if(Arrays.equals(ct, cp))
            {
                return true;
            }
        }
        return false;
    }
}