class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> op = new ArrayList<Integer>();
        Queue<Node> q = new ArrayDeque<>();
        op.add(node.data);
        q.add(node);
        
        while(q.size() > 0){
           
                node = q.remove();
                if(node.left != null){
                    op.add(node.left.data);
                    q.add(node.left);
                }
                
                if(node.right != null){
                    op.add(node.right.data);
                    q.add(node.right);
                }
            
        }
        return op;
    }
}
