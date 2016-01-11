public class Node{
	int data;
	Node left, right;
	
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class PrintPathBST {
	static Node root;
	public static void main(String[] args) {
		PrintPathBST tree=new PrintPathBST();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int path[] = new int[1000];
        tree.printPathsRecur(root,path,0);
	}
	
	
	void printPathsRecur(Node root, int[] path, int pathlength) {
		if(root==null)
			return;
		
		path[pathlength]=root.data;
		pathlength++;
		
		if(root.left==null && root.right==null)
			printArray(path,pathlength);
		else
		{
			printPathsRecur(root.left,path,pathlength);
			printPathsRecur(root.right,path,pathlength);
		}
		
		
	}
	
	void printArray(int [] path, int pathlength) {
		
		for(int i=0;i<pathlength;i++)
			System.out.print(path[i]+" ");
		System.out.println("");
	}
}










