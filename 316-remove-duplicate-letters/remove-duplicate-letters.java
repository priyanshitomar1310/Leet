import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];  
        boolean[] visited = new boolean[26];  
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (visited[ch - 'a']) continue;
            while (result.length() > 0 &&
                   ch < result.charAt(result.length() - 1) &&
                   lastIndex[result.charAt(result.length() - 1) - 'a'] > i) {

                visited[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            result.append(ch);
            visited[ch - 'a'] = true;
        }
        return result.toString();
    }
}
