/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int maxCount=0;
    public int maxDepth(Node root) {
        int count=0;
        if(root==null)
        {
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            maxCount++;
            for(int i=0;i<size;i++)
            {
                Node temp=q.remove();
                for(int j=0;j<temp.children.size();j++)
                {
                   q.add(temp.children.get(j));
                }
            }
        }
        return maxCount;
    }
}