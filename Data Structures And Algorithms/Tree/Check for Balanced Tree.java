class Tree
{
    boolean b=true;
    int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int le = height(root.left);
        int ri = height(root.right);
        if(Math.abs(le-ri)>1) b=false;
        return Math.max(le,ri)+1;
    }
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here`
	height(root);
	return b;
    }
}
