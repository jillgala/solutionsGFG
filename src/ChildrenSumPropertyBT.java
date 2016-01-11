class Node{
	int data;
	Node left, right;
	
	Node(int item){
		data=item;
		left=right=null;
	}
}
public class ChildrenSumPropertyBT {
	static Node root;
	public static void main(String[] args) {
		ChildrenSumPropertyBT tree=new ChildrenSumPropertyBT();
		tree.root=new Node(10);
		tree.root.left=new Node(8);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(3);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(2);
		boolean f=childrensum(root);
		if(f)
			System.out.println("Property Satisfied");
		else
			System.out.println("Property not Satisfied");
	}
	
	public static boolean childrensum(Node root)
	{
		if(root==null || root.left ==null && root.right==null)
			return true;
		
		/*if(root.left==null)
		root.left.data=0;
		
		if(root.right==null)
			root.right.data=0;*/
		
		if(root.data==(root.left.data+root.right.data) && childrensum(root.left) && childrensum(root.right))
			return true;
		else
			return false;
	}

}
