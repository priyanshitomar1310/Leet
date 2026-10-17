class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(str.charAt(i))) 
            {
                i++;
            } 
            else if (!Character.isLetterOrDigit(str.charAt(j))) 
            {
                j--;
            } 
            else if (str.charAt(i) != str.charAt(j)) 
            {
                return false;
            } 
            else 
            {
                i++;
                j--;
            }
        }

        return true;
    }
}