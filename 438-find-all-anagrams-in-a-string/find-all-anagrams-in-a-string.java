class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        if (s.length() < p.length()) return list;
        char[] cp=new char[256];
        char[] ct=new char[256];
        for(int i=0;i<256;i++)
        {
            cp[i]=0;
            ct[i]=0;
        }
        for(int i=0;i<p.length();i++)
        {
            cp[p.charAt(i)]++;
            ct[s.charAt(i)]++;
        }
        if(Arrays.equals(cp, ct))
        {
            list.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
           ct[s.charAt(i)]++;
            ct[s.charAt(i-p.length())]--;
             if(Arrays.equals(cp, ct))
            {
                list.add(i-p.length()+1);
            }
            
        }
        return list;
    }
}