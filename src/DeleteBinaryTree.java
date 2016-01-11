class Node{
	int data;
	Node left, right;
	
	Node(int item){
		data=item;
		left=right=null;
	}
}
public class DeleteBinaryTree {
	static Node root;
	public static void main(String[] args) {
		DeleteBinaryTree tree=new DeleteBinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);

		tree.deletetree(root);
		root=null;
		System.out.println("Tree Deleted");
	}
	
	public void deletetree(Node root) {
		if(root==null)
			return;
		deletetree(root.left);
		deletetree(root.right);
		
		System.out.println(root.data);
		root=null;
		
		
	}

}
