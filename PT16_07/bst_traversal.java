package PT16_07;

public class bst_traversal {
	
	class node{
		int data;
		node left;
		node right;
		
		node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	node root=null;
	
	void inorder(node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" -> ");
		inorder(root.right);
	}
	
	void preorder(node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" -> ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void postorder(node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" -> ");
	}

	public static void main(String[] args) {
		
		bst_traversal tree=new bst_traversal();
		node root=tree.new node(10);
		root.left=tree.new node(5);
		root.right=tree.new node(15);
		
		tree.inorder(root);
		System.out.println();
		tree.preorder(root);
		System.out.println();
		tree.postorder(root);

	}

}
