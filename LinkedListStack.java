package Swe510Hw;

public class LinkedListStack extends LinkedList {
	
	
	// insert new node to the beginning of the stack.
	// Nodes are always inserted to head.
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
	
	// return last inserted node and delete it. 
	// last inserted node is the first node of stack.
	public Node pop() {
		
		Node firstNode = null;
		
		int countMembers = getCountMembers();

		if(countMembers != 0) {
			
			firstNode = head;
			
			head = head.next;
			
			setCountMembers(countMembers - 1);
		
		}
		
		return firstNode;
		
	}
	
	// show info about node count in the stack
	public int showCount() {
		
		int countMembers = getCountMembers();
		
		if(countMembers == 0) {
			System.out.println("\n! No member found! The LinkedListStack seems empty at all.\n");
		}else if(countMembers == 1){
			System.out.println("\nLinkedListStack has only 1 member.\n");
		}else{
			System.out.println("\nLinkedListStack has totally "+ countMembers + " members.\n");
		}
		
		return countMembers;
		
	}

}
