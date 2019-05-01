package Swe510Hw;

import java.util.Arrays;

public class ArrayList {
	
		
	    private int size = 0;
	    private Node[] elements;

	    public Node[] getElements() {
			return elements;
		}

		public void setElements(Node[] elements) {
			this.elements = elements;
		}

		public void setSize(int size) {
			this.size = size;
		}
		
		public int getSize() {
			return size;
		}

		public ArrayList() {
	        elements = new Node[0];
	    }
	 
	    // insert node to the end of the ArrayList
	    public void insert(String memberName, int memberAge) {
	    	enlargeArray();
	    	Node newsNode = new Node(memberName, memberAge);
	        elements[size-1] = newsNode;
	    }
	    
	    // insert node to the Arraylist with a certain index
	    public void insertTo(String memberName, int memberAge, int index) {
	    	
	    	// create a new null node to end
	    	enlargeArray();
	    	
	    	for(int i = elements.length -1 ; i>=0 ; i-- ) {
	    		
	    		// copy node to the next node if they are bigger/equal than given index 
	    		if(i >= index && i != (elements.length -1)) {
	    			elements[i + 1] = elements[i];
	    		}
	    		
	    	}
	    	Node newsNode = new Node(memberName, memberAge);
	    	elements[index] = newsNode;
	    }
	    
	    // insert node to the beginning of the Arraylist
	    public void insertBeginning(String memberName, int memberAge) {
	    	
	    	// create a new null node to end
	    	enlargeArray();
	    	
	    	for(int i = elements.length -1 ; i>=0 ; i-- ) {
	    		
	    		// copy node to the next node
	    		if( i != (elements.length -1)) {
	    			elements[i + 1] = elements[i];
	    		}
	    		
	    	}
	    	
	    	// put new node to the beginning
	    	Node newsNode = new Node(memberName, memberAge);
	    	elements[0] = newsNode;
	    }
	    
	    // delete node in certain index
	    public void deleteMemberAt(int index) {
	    	
	    	// copy node to previous node if it is bigger than given index 
	    	
	    	for(int i=0 ; i < elements.length ; i++ ) {
	    		
	    		if(i > index && i != (elements.length)) {
	    			elements[i -1] = elements[i];
	    		}
	    		
	    	}
	    	
	    	// then delete last node
	    	shortenArray();
	    	
	    	
	    }
	    
	    // delete node by memberName
	    // delete member if exist
	    public boolean deleteByName(String memberName) {
	    	
	    	int i = 0;
	    	boolean found = false;
	    		
    		while(i < (elements.length)) {
    			
    			
    			if(elements[i].memberName.equals(memberName) ) {
    				deleteMemberAt(i); // calls the deleteMemberAt method for found index
    				System.out.println("\n\u2713 "+memberName+" found and deleted succesfully.");
    				found = true;
    				break; // member found, break while loop
    			}
    			
    			i++;
    		}
	    	
    		
    		return found;
	    	
	    }
	    
	    // delete all nodes by copying array to a zero size array
	    // delete all members in Arraylist
	    public void deleteAll() {
	    	int newSize = 0;
	        elements = Arrays.copyOf(elements, newSize);
	        size = newSize;
	        System.out.println("\n\u2713 All members deleted succesfully!");
	    	
	    }
	    
	    // search nodes by memberName 
	    // search member by memberName
	    public boolean searchMember(String memberName) {
	    	int i = 0;
	    	boolean found = false;
	    		
    		while(i < (elements.length)) {
    			
    			if(elements[i].memberName.equals(memberName)) {
    				System.out.println("\n\u2713 Found: " +memberName + " " + elements[i].memberAge + " years old.");
    				found = true;
    				break;
    			}
    			
    			i++;
    		}
	    	
    		return found;
	    }
	    
	    
	    
	    // shorten size of the arrayList
	    public void shortenArray() {
	        int newSize = elements.length - 1;
	        elements = Arrays.copyOf(elements, newSize);
	        size = newSize;
	    }
	    
	    // enlarge size of the arrayList
	    public void enlargeArray() {
	        int newSize = elements.length + 1;
	        elements = Arrays.copyOf(elements, newSize);
	        size = newSize;
	    }
	    
	    //display the elements of arrayList
	    public void display() {
	    	
	    	showCount();
	    	
	    	if(getSize() >= 1) {
	    	
		    	for(int i = 0; i < elements.length ; i++ ) {
		    		
		    		elements[i].Display();
					System.out.println("===========");
		    		
		    	}
		    	
		    	System.out.println("\n");
	    	}
	    }
	    
	    // count of Members
		public int showCount() {
			
			if(size == 0) {
				System.out.println("\n! No member found! The arrayList seems empty at all.\n");
			}else if(size == 1){
				System.out.println("\nArraylist has only 1 member.\n");
			}else{
				System.out.println("\nArraylist has totally "+ size + " members.\n");
			}
			
			return size;
			
		}
		
		
		
	    
	     
}