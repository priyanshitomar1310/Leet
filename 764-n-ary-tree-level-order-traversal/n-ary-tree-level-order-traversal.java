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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> mainList=new ArrayList<>();
        if(root==null)
        {
            return mainList;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node temp=q.remove();
                list.add(temp.val);
                if(temp.children!=null)
                {
                    for (int j = 0; j < temp.children.size(); j++) 
                    {
                        Node child = temp.children.get(j);
                        q.add(child);
                    }
                }
            }
            mainList.add(list);
        }
        return mainList;
    }
}