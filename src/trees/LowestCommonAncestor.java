package trees;

import trees.BinarySearchTree.Node;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		new LowestCommonAncestor().execute();
	}

	public void execute(){
		Node root = new Node(23);

		//Insert into Binary Search Tree
		insertBSTNode(root, 11);
		insertBSTNode(root, 15);
		insertBSTNode(root, 25);
		insertBSTNode(root, 79);
		insertBSTNode(root, 18);
		insertBSTNode(root, 9);
		insertBSTNode(root, 10);
		traverseListInOrder(root);
	}
	
	public void insertBSTNode(Node rootNode, int value){
		if (value < rootNode.value){
			if (rootNode.left != null) {
				insertBSTNode(rootNode.left, value);
			} else {
				Node n = new Node(value);
				rootNode.left = n;
			}
		} else if (value > rootNode.value){
			if (rootNode.right != null) {
				insertBSTNode(rootNode.right, value);
			} else {
				Node n = new Node(value);
				rootNode.right = n;
			}
		} 
	}
	
	public void traverseListInOrder(Node rootNode) {
		if (rootNode != null) {
			traverseListInOrder(rootNode.left);
			System.out.println("Traversing value="+ rootNode.value);
			traverseListInOrder(rootNode.right);
		}
	}
	
	//This is a good solution if p is in the left and q is in the right
	//However, if they both are in the same side, its not very efficient
	public Node lowestCommonAncestor(Node node, Node p, Node q ){
		Node left, right;
		if (node== null) {return null;}
		if (node.left == p || node.right == p || node.left == q || node.right == q){
			return node;
		} else {
			left = lowestCommonAncestor(node.left,p,q);
			right = lowestCommonAncestor(node.right,p,q);
			if(left == null && right == null){
				return null;
			}else if (left!=null && right!=null){
				return node;
			}else {
				return (left!=null)? left : right; 
			}
		}
	}
}
