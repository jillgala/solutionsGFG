class Node{
	int data;
	Node left, right;
	
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}
class BinaryTree {
	static Node root1,root2;
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		
		tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
 
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);
 
        if(tree.IdenticalTree(root1,root2))
        System.out.println("Identical trees");
        else
        	System.out.println("Not identical");

	}

	 boolean IdenticalTree(Node a, Node b) {
	
		if(a==null && b==null)
			return true;
		
		if(a!=null && b!=null) {
			return(a.data==b.data && IdenticalTree(a.left,b.left) && IdenticalTree(a.right, b.right));
			}
		
		return false;
	}
	
}











