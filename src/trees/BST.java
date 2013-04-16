package trees;

public class BST {
	
	public static void main(String[] args){
		BST bst = new BST();
		bst.execute();
	}
	
	public void execute(){
		System.out.println("Create a Binary Search Tree");
		
		Node root = new Node(25);
		insertIntoBST(root, 50);
		insertIntoBST(root, 100);
		insertIntoBST(root, 15);
		insertIntoBST(root, 15);
		insertIntoBST(root, 10);
		insertIntoBST(root, 18);
		insertIntoBST(root, 12);
		insertIntoBST(root, 5);
		insertIntoBST(root, 20);
		insertIntoBST(root, 14);
		
		searchElementinBST(root, 18);
		
		System.out.println("------------------ Inorder sequence is -----------");
		inOrderSequence(root);
		
		System.out.println("------------------ Preorder sequence is -----------");
		preOrderSequence(root);
		
		System.out.println("------------------ Postorder sequence is -----------");
		postOrderSequence(root);
		
		System.out.println("------------------ Inorder Predecessor -----------");
		findInorderPredecessor(root, 12);
		
		System.out.println("------------------ Delete Node 20 -----------");
		deleteNode(root, 20);
		inOrderSequence(root);
		
		System.out.println("------------------ Delete Node 12 -----------");
		deleteNode(root, 12);
		inOrderSequence(root);
		
		System.out.println("------------------ Delete Node 15 -----------");
		deleteNode(root, 15);
		inOrderSequence(root);	
		
		
	}
	
	 Node searchElementinBST(Node root, int value) {
		if(root == null){
			return null;
		} else if(root.value == value){
			return root;
		}else if(value < root.value){
				searchElementinBST(root.left, value);
		} else {
				searchElementinBST(root.right, value);
		}
		return root;
	}

	Node insertIntoBST(Node root, int value){
		if(root == null){
			root = new Node(value);
			root.left = null;
			root.right = null;
		} else if (value < root.value){
			root.left = insertIntoBST(root.left, value);
		} else if (value > root.value) {
			root.right = insertIntoBST(root.right, value);
		}
		return root;
	}
	
	Node deleteNode(Node root, int value){
		Node temp;
		
		if(root == null){
			System.out.println("Node is not there");
		} else if (value < root.value){
			root.left = deleteNode(root.left, value);
		} else if (value > root.value){
			root.right = deleteNode(root.right, value);
		} else {
			//Found element
			if (root.left == null && root.right == null){
				return null;
			}
			if((root.left!=null) && (root.right!=null)){
				 temp = findMax(root.left);
				 root.value = temp.value;
				 root.left = deleteNode(root.left, temp.value);
			} else {
				//One child
				temp = root;
				if(root.left == null){
					root = root.right;
				} else if(root.right == null){
					root = root.left;
				}
			}
		}
		return root;
	}
	
	Node findMax(Node root){
		if(root == null){
			return null;
		}
		while(root.right != null){
			root = root.right;
		}
		return root;
	}
	
	void inOrderSequence(Node root){
		if (root != null) {
			inOrderSequence(root.left);
			System.out.println("Node value is " + root.value);
			inOrderSequence(root.right);
		}
	}
		
	void preOrderSequence(Node root){
		if (root != null) {
			System.out.println("Node value is " + root.value);
			preOrderSequence(root.left);
			preOrderSequence(root.right);
		}
	}

	void postOrderSequence(Node root){
		if (root != null) {
			System.out.println("Node value is " + root.value);
			preOrderSequence(root.right);
			preOrderSequence(root.left);
		}

	}
	
	Node findInorderPredecessor(Node root, int element){
		
		
		return null;
	}
	
}

class Node{
	int value;
	Node left;
	Node right;
	
	Node(int v){
		this.value = v;
	}
	
}
