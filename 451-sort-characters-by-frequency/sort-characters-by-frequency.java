class Solution {
    public String frequencySort(String s) {
        StringBuilder st=new StringBuilder("");
        int[] count=new int[256];
        for(int i=0;i<count.length;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<256;i++)
        {
            if(count[i]>0)
            {
                list.add((char)i);
                
            }
        }
        list.sort((a, b) -> Integer.compare(count[b], count[a]));
        for(int i=0;i<list.size();i++)
        {
             char c = list.get(i);
              for (int j = 0; j < count[c]; j++) {
              st.append(c);
             }
        }
       return st.toString();
         
    }
}