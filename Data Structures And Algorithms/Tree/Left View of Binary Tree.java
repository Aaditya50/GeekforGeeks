class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      left(root,ans,0);
      return ans;
    }
    void left(Node root, ArrayList<Integer> view, int i) {
        
        if (root == null) {
            return;
        }
        
        if (view.size() == i) {
            view.add(root.data);
        }
        
        left(root.left, view, i+1);
        left(root.right, view, i+1);
    }
}
