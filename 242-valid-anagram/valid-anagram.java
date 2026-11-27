class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        // int[] freq=new int[26];
        // for(int i=0;i<s.length();i++)
        // {
        //     freq[s.charAt(i)-'a']++;
        //     freq[t.charAt(i)-'a']--;
        // }
        // for(int i=0;i<26;i++)
        // {
        //     if(freq[i]!=0)
        //     {
        //         return false;
        //     }
        // }
        // return true;

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }

        for(char key:map.keySet())
        {
            if(map.get(key)!=0)
            {
                return false;
            }
        }
        return true;
    }
}