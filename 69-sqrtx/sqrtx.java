class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        for (int i = 1; i <= x / i; i++) {  
            if (i * i == x) {
                return i;
            }
            if (i * i < x) {
                ans = i; 
            }
        }
        return ans;
    }
}
