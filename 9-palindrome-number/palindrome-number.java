class Solution {
    public boolean isPalindrome(int x) {
        int rem,sum=0,temp;
        temp=x;
        while(x!=0)
        {
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(temp==sum && sum>=0)
         return true;
        else
         return false;
    }
}