class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        if(root == null) return 0;
        int le = diameter(root.left);
        int ri = diameter(root.right);
        int f = height(root.left)+height(root.right)+1;
        return Math.max(f,Math.max(le,ri));
    }
    int height(Node node){
        if(node == null) return 0;
        int le = height(node.left);
        int ri = height(node.right);
        return Math.max(le,ri)+1;
    }
}
