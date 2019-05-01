package Swe510Hw;

public class LinkedListQueue extends LinkedList {
	
	
	// insert new node to the beginning of the queue.
	// Nodes are always inserted to  head.
	public void insert(String memberName, int memberAge) {
	
		
		Node newNode = new Node(memberName,memberAge);
		
		if(isEmpty()){
			head = newNode;
			newNode.next = null;
		}else{
			
			newNode.next = head;
			head = newNode;

		}
		
		setCountMembers(getCountMembers() + 1);
		
	}


	// return first inserted node and delete it. 
	// first inserted node is the last node of the linkedlist
	public Node dequeue() {
		
		Node lastNode = null;
		Node tempNode = head;
		Node prevNode = head;
		
		int countMembers = getCountMembers();

		if(countMembers != 0) {
			
			while(tempNode != null) {
				
				
				// if tempNode is the last node
				if(tempNode.next == null) {
					
					lastNode = tempNode;
					prevNode.next = null;
					
					setCountMembers(getCountMembers() - 1);
					break;
				}
					
				
				prevNode = tempNode;
				tempNode = tempNode.next;
				
				
			}

		
		}
		
		return lastNode;
		
	}
	
	// show info about node count in the queue.
	public int showCount() {
		
		int countMembers = getCountMembers();
		
		if(countMembers == 0) {
			System.out.println("\n! No member found! The LinkedListQueue seems empty at all.\n");
		}else if(countMembers == 1){
			System.out.println("\nLinkedListQueue has only 1 member.\n");
		}else{
			System.out.println("\nLinkedListQueue has totally "+ countMembers + " members.\n");
		}
		
		return countMembers;
		
	}

}
