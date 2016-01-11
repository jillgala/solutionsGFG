import java.util.Stack;
public class Node{
	int data;
	Node left, right;
	
	Node(int item){
		data=item;
		left=right=null;
	}
}
public class LevelOrderSpiralTraversal {
	static Node root;
	public static void main(String[] args) {
		LevelOrderSpiralTraversal tree=new LevelOrderSpiralTraversal();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.left.left=new Node(6);
		tree.root.left.right.left=new Node(7);
		tree.root.right.left=new Node(8);
		printspiral(root);

	}
	
	public static void printspiral(Node root) {
		if(root==null)
			return;
		
		Stack <Node> s1=new Stack <Node>();
		Stack <Node> s2=new Stack <Node>();
		s1.add(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				root=s1.pop();
				System.out.println(root.data);
				if(root.right!=null)
					s2.push(root.right);
				if(root.left!=null)
					s2.push(root.left);
				
				
			}
			
			while(!s2.isEmpty()) {
				root=s2.pop();
				System.out.println(root.data);
				if(root.left!=null)
					s1.push(root.left);
				if(root.right!=null)
					s1.push(root.right);
				
				
			}
		}
	}

}










