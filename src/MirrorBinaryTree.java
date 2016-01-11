public class Node{
	int data;
	Node left, right;
	
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class MirrorBinaryTree {
	static Node root;
	public static void main(String[] args) {
		MirrorBinaryTree tree=new MirrorBinaryTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("BST");
        tree.inorder(root);
       
        tree.mirror(root);
        
        System.out.println("Mirror BST");
        tree.inorder(root);
	}
	
	void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	void mirror(Node root) {
		if(root==null)
			return;
		Node temp;
		temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	
}















