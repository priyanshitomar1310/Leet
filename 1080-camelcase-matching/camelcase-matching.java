class Solution {
    public boolean isCamelCase(String s,String p)
    {
         int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (i < p.length() && c == p.charAt(i)) {
                i++; 
            } else if (Character.isUpperCase(c)) {
                return false; 
            }
        }
        return i == p.length(); 
    }
    
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {
            if(isCamelCase(queries[i],pattern))
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}