import java.util.Queue;
import java.util.LinkedList;
public class Node{
	int data;
	Node left, right;
	
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class LevelOrderTreeTraversal {
	 static Node root;
	public static void main(String[] args) {
		LevelOrderTreeTraversal tree=new LevelOrderTreeTraversal();
		tree.root= new Node(1);
	    tree.root.left= new Node(2);
	    tree.root.right= new Node(3);
	    tree.root.left.left= new Node(4);
	    tree.root.left.right= new Node(5);
	    tree.levelorder(root);

	}
	public void levelorder(Node root) {
		if(root==null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
		root=q.poll();
		System.out.println(root.data);
		if(root.left!=null)
			q.add(root.left);
		if(root.right!=null)
			q.add(root.right);
	}

	}

}