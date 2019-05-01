package Swe510Hw;

public class BinarySearchTree {
	
	
	Node root;
	private int size = 0;
	private boolean search_found = false;
	
	
	public boolean isSearch_found() {
		return search_found;
	}

	public void setSearch_found(boolean search_found) {
		this.search_found = search_found;
	}
	
	
	

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}


	BinarySearchTree(){
		root = null;
	}
	
	
	

	public void insert(String memberName, int memberAge) {
    	
    	Node newsNode = new Node(memberName, memberAge);
    	
    	size++;
        
    	if(root == null) {
    		
    		root = newsNode;
    		
    	}else{
    		
    		Node tempNode = root;
    		Node parent;
    		
    		while(true) {
    			 parent = tempNode;
    			 
    			 if(memberAge < tempNode.memberAge) {
    				 tempNode = tempNode.leftChild;
    				 
    				 if(tempNode == null) {
    					 parent.leftChild = newsNode;
    					 return;
    				 }
    			 }else {
    				 tempNode = tempNode.rightChild;
    				 if(tempNode == null) {
    					 parent.rightChild = newsNode;
    					 return;
    				 }
    			 }
    		}
    		
    		
    	}
    	
    	
    	
    }
	
	
	
	public void display(Node n) {
		
		
		
		if(n != null) {
			display(n.leftChild);
			System.out.println("Member Name :" + n.memberName);
			System.out.println("Member Age :" + n.memberAge);
			System.out.println("===========");
			display(n.rightChild);
			
		}

	}
	
	
	public void searchMember(String memberName, Node n) {
		
    	
    	if(n != null) {
    		searchMember(memberName,n.leftChild);
			
			if(n.memberName.equals(memberName)) {
				System.out.println("\n\u2713 Found: " + n.memberName + " " + n.memberAge + " years old.");
    			
				setSearch_found(true);
			}
			
			searchMember(memberName,n.rightChild);
			
		}

	}
	
	public void searchMemberbyAge(int memberAge, Node n) {
		
    	
    	if(n != null) {
    		searchMemberbyAge(memberAge,n.leftChild);
			
			if(n.memberAge == memberAge) {
				setSearch_found(true);
			}
			
			searchMemberbyAge(memberAge,n.rightChild);
			
		}

	}
	
	
	public Node deleteMember(int memberAge, Node root) {
		
		searchMemberbyAge(memberAge,root);
		
		if(root == null) return root;
		 
        if(memberAge < root.memberAge) {
            root.leftChild = deleteMember(memberAge,root.leftChild);
        } else if(memberAge > root.memberAge) {
            root.rightChild = deleteMember(memberAge,root.rightChild);
        } else {
        	
            // node with no leaf nodes
            if(root.leftChild == null && root.rightChild == null) {
                return null;
            } else if(root.leftChild == null) {
                // node with one node (no left node)
                return root.rightChild;
            } else if(root.rightChild == null) {
                // node with one node (no right node)
                return root.leftChild;
            } else {
            	 
                // nodes with two nodes
                // search for min number in right sub tree
                Integer minValue = minValue(root.rightChild);
                root.memberAge = minValue;
                root.rightChild = deleteMember(minValue, root.rightChild);
               
                
            }
            
            
            
        }

        
        return root;
	}
	
	
	int minValue(Node root) 
    { 
        int minv = root.memberAge; 
        while (root.leftChild != null) 
        { 
            minv = root.leftChild.memberAge; 
            root = root.leftChild; 
        } 

        return minv; 
    } 
	
	//count of Members
	public int showCount() {
		
		if(size == 0) {
			System.out.println("\n! No member found! The binarySearchTree seems empty at all.\n");
		}else if(size == 1){
			System.out.println("\nBinarySearchTree has only 1 member.\n");
		}else{
			System.out.println("\nBinarySearchTree has totally "+ size + " members.\n");
		}
		
		return size;
		
	}
	
	
	
	
	

}
