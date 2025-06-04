class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> st = new Stack<>();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == '*') {
                st.push(i);
            } else { 
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!st.isEmpty()) {
                    st.pop();
                } else {
                    return false;
                }
            }
            i++;
        }

        while (!stack.isEmpty() && !st.isEmpty()) {
            if (stack.peek() > st.peek()) {
                return false;
            }
            stack.pop();
            st.pop();
        }

        return stack.isEmpty();
    }
}
