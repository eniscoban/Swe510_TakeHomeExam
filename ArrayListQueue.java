package Swe510Hw;

public class ArrayListQueue extends ArrayList {

	
	// insert new node to the beginning of the queue.
	// Nodes are always inserted to  index 0.
	public void insert(String memberName, int memberAge) {
    	
		enlargeArray();
		
		int size = getSize();
		
		for(int i = size -1 ; i>=0 ; i-- ) {
    		
    		if( i != (size -1)) {
    			getElements()[i + 1] = getElements()[i];
    		}
    		
    	}
		Node newsNode = new Node(memberName, memberAge);
    	getElements()[0] = newsNode;
    	
    }
	
	
	// return first inserted node and delete it. 
	// first inserted node is the last node of array
    public Node dequeue() {
    	
    	int size = getSize();
    	Node lastMember = getElements()[size-1];
    	
    	shortenArray();
    	
    	return lastMember;
    }
	
    // show info about node count in the stack
	public int showCount() {
		
		int size = getSize();
		
		if(size == 0) {
			System.out.println("\n! No member found! The arrayListQueue seems empty at all.\n");
		}else if(size == 1){
			System.out.println("\nArraylistQueue has only 1 member.\n");
		}else{
			System.out.println("\nArraylistQueue has totally "+ size + " members.\n");
		}
		
		return size;
		
	}
	
	
	
	
}
