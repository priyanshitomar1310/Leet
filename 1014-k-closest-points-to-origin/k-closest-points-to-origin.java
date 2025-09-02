class Solution {
    public static class Ans implements Comparable<Ans>{
        int x;
        int y;
        int distance;
        public Ans(int x,int y,int distance)
        {
            this.x=x;
            this.y=y;
            this.distance=distance;
        }
        @Override
        public int compareTo(Ans a)
        {
            return this.distance-a.distance;
        }
    } 
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Ans> p=new PriorityQueue<>();
        for(int i=0;i<points.length;i++)
        {
            int distance=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            p.add(new Ans(points[i][0],points[i][1],distance));
        }
        int[][] mat=new int[k][2];
        for(int i=0;i<k;i++)
        {
            Ans point = p.remove();
            mat[i][0] = point.x;
            mat[i][1] = point.y;
        }
        return mat;
    }
}