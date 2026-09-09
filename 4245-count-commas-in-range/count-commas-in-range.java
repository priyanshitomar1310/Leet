class Solution {
    public int countCommas(int n) {
        int digitCount=0,temp=n;
        while(temp!=0)
        {
            digitCount++;
            temp/=10;
        }
        if(digitCount<=3)
        {
            return 0;
        }
        return n-1000+1;
    }
}