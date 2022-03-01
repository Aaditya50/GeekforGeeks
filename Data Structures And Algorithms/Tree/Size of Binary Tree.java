class Tree
{
	public static int getSize(Node root)
	{
//add Code here.
        if(root == null) return 0;
        int le = getSize(root.left);
        int ri = getSize(root.right);
        int size = le+ri+1;
        return size;
    }
}
