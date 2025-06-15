class Solution {
    public String reverse(String st) {
        StringBuilder string = new StringBuilder(st);
        int i = 0, j = st.length() - 1;
        while (i < j) {
            char temp = string.charAt(i);
            string.setCharAt(i, string.charAt(j));
            string.setCharAt(j, temp);
            i++;
            j--;
        }
        return string.toString();
    }
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int e = Math.min(i + k, s.length());
            str.append(reverse(s.substring(i, e)));
            e = Math.min(i + 2 * k, s.length());
            if (i + k < s.length()) {
                str.append(s.substring(i + k, e));
            }
        }
        return str.toString();
    }
}
