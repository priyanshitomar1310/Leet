class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] s=new String[score.length];
        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<score.length;i++)
        {
           p.add(score[i]);
        }
        int i=0,count=0;
        while(!p.isEmpty())
        {
           for(i=0;i<score.length;i++)
           {
              if(score[i]==p.peek())
              {
                break;
              }
           }
           count++;
           if(count==1)
           {
              s[i]="Gold Medal";
           }
           else if(count==2)
           {
            s[i]="Silver Medal";
           }
           else if(count==3)
           {
            s[i]="Bronze Medal";
           }
           else
           {
             s[i]=String.valueOf(count);
           }
           p.remove();
        }
        return s;
    }
}