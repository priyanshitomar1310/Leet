class Solution {
    public int squareSum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1)
        {
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));
             if(slow==1)
            {
                return true;
            }
            if(fast==slow)
            {
                return false;
            }
        }
        return true;
    }
}