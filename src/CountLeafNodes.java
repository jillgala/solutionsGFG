public class CountLeafNodes {
	static Node root;
	public static void main(String[] args) {
		CountLeafNodes tree=new CountLeafNodes();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		int count=count(root);
		System.out.println(count);
	}
	
	public static int count(Node root) {
		if(root==null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		
		return count(root.left)+count(root.right);
	
	}

}
