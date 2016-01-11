import java.lang.Math;

class Node{
	int data;
	Node left, right;
	
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class BinaryTreeHeight {
	static Node root;
	public static void main(String[] args) {
		
		BinaryTreeHeight tree=new BinaryTreeHeight();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int a=tree.Height(root);
        System.out.println("Height:"+a);
	}

	public int Height(Node root) { 
	
	if(root==null)
		return 0;
	
	else 
	{
		int a=Height(root.left);
		int b=Height(root.right);
		if(a>b)
			return a+1;
		else return b+1;
	}
}
}