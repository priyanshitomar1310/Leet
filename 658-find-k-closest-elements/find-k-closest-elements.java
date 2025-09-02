class Solution {
    static class Ans implements Comparable<Ans>{
        int e;
        int dis;
        public Ans(int e,int dis)
        {
            this.e=e;
            this.dis=dis;
        }
        public int compareTo(Ans a) {
            if (this.dis == a.dis) {
                return this.e - a.e; 
            }
            return this.dis - a.dis;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        PriorityQueue<Ans> p=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
           int distance=Math.abs(x-arr[i]);
           p.add(new Ans(arr[i],distance));   
        }
        for(int i=0;i<k;i++)
        {
            list.add(p.remove().e);
        }
        Collections.sort(list);
        return list;
    }
}