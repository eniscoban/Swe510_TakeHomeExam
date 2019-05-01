package Swe510Hw;

public class ArrayListStack extends ArrayList {

	
	// insert new node to the beginning of the stack.
	// Nodes are always inserted to  index 0.
	public void insert(String memberName, int memberAge) {
    	
		enlargeArray();
		
		int size = getSize();
		
		// copy every node to next node
		// so index 0 and index 1 should be same
		for(int i = size -1 ; i>=0 ; i-- ) {
    		
    		if( i != (size -1)) {
    			getElements()[i + 1] = getElements()[i];
    		}
    		
    	}
		
		// then set new node to index 0
		Node newsNode = new Node(memberName, memberAge);
    	getElements()[0] = newsNode;
    	
    }
	
	
	// return last inserted node and delete it. 
    public Node pop() {
    	
    	int size = getSize();
    	Node firstMember = getElements()[0];
    	
    	
    	for(int i = 0; i<size-1; i++ ) {
    		
    		getElements()[i] = getElements()[i+1];
    		
    	}
    	
    	shortenArray();
    	
    	return firstMember;
    }
		
    
    // show info about node count in the stack
	public int showCount() {
		
		int size = getSize();
		
		if(size == 0) {
			System.out.println("\n! No member found! The arrayListStack seems empty at all.\n");
		}else if(size == 1){
			System.out.println("\nArraylistStack has only 1 member.\n");
		}else{
			System.out.println("\nArraylistStack has totally "+ size + " members.\n");
		}
		
		return size;
		
	}
	
	
	
	
}
