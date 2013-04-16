package trees;
public class BinarySearchTree {

	static class Node {
		int value;
		Node left;
		Node right;
	
		public Node(int value){
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		new BinarySearchTree().execute();
	}

	public void execute(){
		Node root = new Node(25);

		//Insert into binary tree
		/*insertNode(root, 11);
		insertNode(root, 8);
		insertNode(root, 15);
		insertNode(root, 16);
		insertNode(root, 23);
		insertNode(root, 79);*/
		
		//Print List
		/*System.out.println("Binary tree print Pre-order");
		traverseListPreOrder(root);*/

		//Insert into Binary Search Tree
		insertBSTNode(root, 11);
		insertBSTNode(root, 15);
		insertBSTNode(root, 16);
		insertBSTNode(root, 23);
		insertBSTNode(root, 79);
		//Print List
		traverseListInOrder(root);
		
		//Count Leaf Node
		System.out.println("Leaf count is= " + countLeafNodes(root));
		
		//Count Total Nodes
		System.out.println("Total Count is= " + countTotalNodes(root));
		
		//Find Maximum Depth
		System.out.println("Maximum Depth is= " + (findMaximumDepth(root) -1));
		
		//Copy Tree
		Node copy = createCopy(root);
		traverseListInOrder(copy);
		
		//Mirror 
		Node mirrorNodes = createMirrorNodes(root);
		System.out.println("Mirrored Tree is");
		traverseListInOrder(mirrorNodes);
		
		//isBST????
		//boolean isBst = isBST(root);
		//System.out.println(isBst);
		
		//Find the largest element
		//int largestElt = largestElement(root);
		//System.out.println("Largest Element is" + largestElt);
		
		//Find the smallest element
		//int smallestElt = smallestElement(root);
		//System.out.println("Smallest Element is" + smallestElt);
		
		//Find the kth largest
		
		//Delete
		
		//Count no of Trees
	}
		
	//Dont check for value
	//http://stackoverflow.com/questions/6380231/difference-between-binary-tree-and-binary-search-tree
	public Node insertNode(Node root, int value){
		if (root == null){
			root = new Node(value);
		} else {
			if (root.left != null){
				root.left = insertNode(root.left, value);
			} else {
				root.right = insertNode(root.right, value);
			}
		}
		return root;
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

	public void deleteNode(Node rootNode, int value){
		Node leftNode = rootNode.left;
		if (value == leftNode.value){
			if (leftNode.left == null && leftNode.right == null) {
				leftNode = null;
			} else if (leftNode.left != null && leftNode.right == null) {
				leftNode = leftNode.left;
			} else {
				leftNode = leftNode.right;
			}			
		} else {
			deleteNode(rootNode.left, value);
		} 
	}
	
	public void traverseListInOrder(Node rootNode) {
		if (rootNode != null) {
			traverseListInOrder(rootNode.left);
			System.out.println("Traversing value="+ rootNode.value);
			traverseListInOrder(rootNode.right);
		}
	}

	public void traverseListPreOrder(Node rootNode) {
		if (rootNode != null) {
			System.out.println("Traversing value="+ rootNode.value);
			traverseListPreOrder(rootNode.left);
			traverseListPreOrder(rootNode.right);
		}
	}
	
	public int countLeafNodes(Node rootNode){
		if (rootNode == null){
			return 0;
		}
		if (rootNode.left == null && rootNode.right == null) {
			return 1;
		}
		else {
			return countLeafNodes(rootNode.left) + countLeafNodes(rootNode.right);			
		}
	}
	
	public int countTotalNodes(Node rootNode){
		if (rootNode == null){
			return 0;
		}
		return (countTotalNodes(rootNode.left) + 1 + countTotalNodes(rootNode.right));
	}

	public int findMaximumDepth(Node rootNode){
		if (rootNode == null){
			return 0;
		}
		else {
			int leftCount = findMaximumDepth(rootNode.left);
			int rightCount = findMaximumDepth(rootNode.right);
			
			return (Math.max(leftCount, rightCount) + 1);
		}
	}
	
	public Node createCopy(Node rootNode){
		if (rootNode != null){
			Node newNode = new Node(rootNode.value);
			if (rootNode.left != null){
				newNode.left = createCopy(rootNode.left);
			}
			if (rootNode.right != null){
				newNode.right = createCopy(rootNode.right);
			}
			return newNode;
		}
		else {
			return null;
		}
	}

	public Node createMirrorNodes(Node rootNode){
		if (rootNode != null){
			Node newNode = new Node(rootNode.value);
			if (rootNode.left != null){
				newNode.right = createMirrorNodes(rootNode.left);
			}
			if (rootNode.right != null){
				newNode.left = createMirrorNodes(rootNode.right);
			}
			return newNode;
		}
		else {
			return null;
		}
	}

	public boolean matchTree(Node r1, Node r2){
		if(r1 == null && r2 == null)
			return true;
		if (r1.value!= r2.value)
			return false;
		return matchTree(r1.left,r2.left) && matchTree(r1.right, r2.right);
	}
	
	public boolean isSubTree(Node r1, Node r2){
		if (r1==null) return false;
		if (r2==null)return true;
		if(r1.value == r2.value){
			if (matchTree(r1,r2)) return true;
		}
		return isSubTree(r1.left, r2) || isSubTree(r1.right,r2);
	}
	
	//Refer to the link -- it is given properly there in practice B
	public boolean isBST(Node rootNode){
		if (rootNode == null) {return true;}
		
		if (rootNode.left != null && rootNode.left.value < rootNode.value 
				&& rootNode.right.value > rootNode.value){
			return true;
		} else {
			return false;
		}
	}

	public Node largestElement(Node rootNode){
		while(rootNode.right != null){
			rootNode = rootNode.right;
		}
		return rootNode;
	}

	public Node smallestElement(Node rootNode){
		while(rootNode.left != null){
			rootNode = rootNode.left;
		}
		return rootNode;
	}
	
	/*public Node successorInOrder(Node node){
		if (node.right!= null) {
			return smallestElement(node.right);
		}
		Node y = node.parent;
		while(y!= null && node == y.right){
			node = y;
			y = y.parent;
		}
	}
*/
	
	public Node lowestCommonAncestor(Node node, Node p, Node q ){
		Node left, right;
		if (node== null) {return null;}
		if (node.left == p || node.right == p || node.left == q || node.right == q){
			return node;
		} else {
			left = lowestCommonAncestor(node.left,p,q);
			right = lowestCommonAncestor(node.right,p,q);
			if (left!=null && right!=null){
				return node;
			}else {
				return (left!=null)? left : right; 
			}
		}
	}
}
