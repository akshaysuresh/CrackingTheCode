package linkedlists;

public class LinkedListOperations {
	
	static Node head;
	
	public static void main(String[] args){
		
		//add the following nodes to the linked List
		addNode(10);
		addNode(20);
		addNode(30);
		getAllList();
	}

	public static void addNode(int value){
		 
		Node node = new Node(value);
		 
		 Node temp = head;
		 if(head == null){
			 head = node;
		 } else {
			 while(temp.next != null){
				 temp = temp.next;
			 }
			 temp.next = node;
		 }
	}
	
	public static void getAllList(){
		
		if (head == null){
			System.out.println("Empty list");
		} else {
			Node n = head;
			while(n.next != null) {
				System.out.println(n.data);
				n = n.next;
			}			
		}
		
	}
	
	public Node deleteNode(int value){
		Node n = head;
		
		if(value == n.data){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.data == value){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}	
		return null;
	}
	
	
	public void reverseLinkedList(){
		if(head == null){
			return;
		}

		Node current = null, prev = null, next= null;
		current = head;
		while(current.next != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current  = next;		
		}
		head = prev;
	}
	
}
