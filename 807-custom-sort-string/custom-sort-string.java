class Solution {
    public int countChar(char ch, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public boolean isExists(char ch, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public String customSortString(String order, String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            int count = countChar(ch, s);
            for (int j = 0; j < count; j++) {
                str.append(ch);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isExists(ch, order)) {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
