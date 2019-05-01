package Swe510Hw;


public class LinkedList extends List {
	
	
	Node head;
	private int countMembers = 0;
	
	public int getCountMembers() {
		return countMembers;
	}

	public void setCountMembers(int countMembers) {
		this.countMembers = countMembers;
	}
	
	//check if linkedlist is empty or not
	public boolean isEmpty() { 
		return(head == null);
	}
	
	// insert new Member with name and age to the end of Linkedlist
	public void insert(String memberName, int memberAge) {
		
		Node newNode = new Node(memberName,memberAge);
		newNode.next = null;
		
		if(isEmpty()){
			head = newNode;
		}else{
			
			Node oldLastNode = head;
			while(oldLastNode.next != null) {
				oldLastNode = oldLastNode.next;
			}
			oldLastNode.next = newNode;
		}
		countMembers ++;
	}
	
	
	// insert new Member with name and age and index
	public void insertTo(String memberName, int memberAge, int index) {
		
		Node newNode = new Node(memberName,memberAge);
		
		if(isEmpty()){
			head = newNode;
			newNode.next = null;
			countMembers ++;
		}else{
			
			int prevIndex = index - 1;
			if(index == 0) {
				
				// if desired index is 0, run insertBeginning method
				insertBeginning(memberName, memberAge);
				
			}else{
				
				Node tempNode = head;
				
				
				for(int i =0; i<countMembers; i++) {

					// insert new node if loop reaches desired index
					if(i == prevIndex) {
						newNode.next = tempNode.next;
						tempNode.next = newNode;
					}
					tempNode = tempNode.next;

				}
				countMembers ++;
			}
			
		}
		
	}
	
	
	//insert new member to beginning
	public void insertBeginning(String memberName, int memberAge) {
		
		Node newNode = new Node(memberName,memberAge);
		
		if(isEmpty()){
			head = newNode;
			newNode.next = null;
		}else{
			
			newNode.next = head;
			head = newNode;

		}
		countMembers ++;
		
	}
	
	//search member by name
	public boolean searchMember(String memberName) {
		
		Node tempNode = head;
		boolean found = false;
		
		if(!isEmpty()){
			
			while(tempNode != null) {
				
				if(tempNode.memberName.equals(memberName)) {
					
					System.out.println("\n\u2713 Found: " +tempNode.memberName + " " + tempNode.memberAge + " years old.");
					found = true;
					return found;
				}

				tempNode = tempNode.next;
				
			}
				
		}
		
		return found;
	
	}

	
	//delete member By Name if exist
	public boolean deleteByName(String memberName) {
	
		Node tempNode = head;
		Node prevNode = head;
		boolean found = false;
		
		if(!isEmpty()){
			
			while(tempNode != null) {
				
				if(tempNode.memberName.equals(memberName)) {
					
					// if member has been found, set previous next to current next
					
					if(tempNode == head) {
						head = head.next;
					}else{
						prevNode.next = tempNode.next;
					}
					
					System.out.println("\n\u2713 " +tempNode.memberName + " deleted succesfully!");
					found = true;
					countMembers --;
					return found;  
				}
				
				prevNode = tempNode;
				tempNode = tempNode.next;
				
			}
				
		}
		
		return found;
	
	}
	
	//delete member by index
	public void deleteMemberAt(int index) {
		
		Node tempNode = head;
		Node prevNode = head;
		
		
		if(index == 0) {
			System.out.println("\n\u2713 " +tempNode.memberName + " deleted succesfully!");
			tempNode = tempNode.next;
			head = tempNode;
			
		}else{
		
			// loop all nodes
			for(int i = 0; i<countMembers; i++) {
	
				// if index is found, set previous node's next to current node's next 
				if(i == index) {
					System.out.println("\n\u2713 " +tempNode.memberName + " deleted succesfully!");
					prevNode.next = tempNode.next;
				}
				prevNode = tempNode;
				tempNode = tempNode.next;
	
			}
			
		}
		
		countMembers --;
	}
	
	
	//delete all members
	public void deleteAll() {
		head = null;
		System.out.println("\n\u2713 All members deleted succesfully!");
		countMembers = 0;
	}
	
	
	//display all members
	public void display() {
		
		Node tempNode = head;
		
		showCount();
		
		if(!isEmpty()){
			
			while(tempNode != null) {
				tempNode.Display();
				
				if(tempNode.next != null) {
					System.out.println("Next: " + tempNode.next.memberName);
				}else {
					System.out.println("Next: This is the last member.");
				}
				
				System.out.println("===========");
				tempNode = tempNode.next;
				
			}
				
		}
		
	}
	
	
	//count of Members
	public int showCount() {
		
		if(countMembers == 0) {
			System.out.println("\n! No member found! The LinkedList seems empty at all.\n");
		}else if(countMembers == 1){
			System.out.println("\nLinkedlist has only 1 member.\n");
		}else{
			System.out.println("\nLinkedlist has totally "+ countMembers + " members.\n");
		}
		
		return countMembers;
		
	}


	
	



	
	
	
	

}
