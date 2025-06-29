class Solution {
    public boolean isPossible(String s, String chars) {
        int[] charCount = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            charCount[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charCount[ch - 'a'] == 0) {
                return false;
            }
            charCount[ch - 'a']--;
        }
        return true;
    }

    public int countCharacters(String[] words, String chars) {
        int length = 0;
        for (int i = 0; i < words.length; i++) {
            if (isPossible(words[i], chars)) {
                length += words[i].length();
            }
        }
       return length;
    }
}
