class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        int[] seen = new int[256]; 
        int left = 0; 
        for (int right = 0; right < n; right++) {
            seen[s.charAt(right)]++;
            while (seen[s.charAt(right)] > 1) {
                seen[s.charAt(left)]--;
                left++;
            }
            max= Math.max(max, right - left + 1);
        }
        
        return max;
    }
}
