class Solution {
    static class Row implements Comparable<Row>{
        int count;
        int index;
        public Row(int count,int index)
        {
            this.count=count;
            this.index=index;
        }
        @Override
        public int compareTo(Row r)
        {
            if(this.count==r.count)
            {
                return this.index-r.index;
            }
            else
            {
                return this.count-r.count;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> p=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                count+=mat[i][j];
            }
            p.add(new Row(count,i));
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = p.remove().index;
        }
        return ans;

    }
}