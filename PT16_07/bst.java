package PT16_07;

public class bst {
	
	static class node{
		int val;
		node left;
		node right;
		
		node(int key){
			val=key;
			left=right=null;
		}
	}
	
	node root=null;
	
	void preorder(node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" -> ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void inorder(node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.val+" -> ");
		inorder(root.right);
	}
	
	void postorder(node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val+" -> ");
	}
	
	node insert(int val) {
		root=insert_val(val, root);
		return root;
	}
	
	node insert_val(int val, node root) {
		if(root==null) {
			return new node(val);
		}
		else if(val<root.val) {
			root.left=insert_val(val, root.left);
		}
		else if (val>root.val) {
			root.right=insert_val(val, root.right);
		}
		return root;
	}
	
	public static void main(String[] args) {
		bst tree=new bst();
		tree.insert(15);
		tree.insert(5);
		tree.insert(25);
		tree.insert(2);
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.inorder(tree.root);
		System.out.println();
		tree.preorder(tree.root);
		System.out.println();
		tree.postorder(tree.root);
	}

}
