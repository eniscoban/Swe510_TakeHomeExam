package Swe510Hw;

public class Node {
	
	
	// This is a node for arrayList, linkedList and binarySearchTree
	// Nodes have commonly 2 parameters; memberName and memberAge.
	// Linkedlists have also "next" parameter to hold next node.
	// BinarySearchTree has 2 more paremeters to hold child nodes; leftChild and rightChild
	
	
	public String memberName; 
	public int memberAge;
	public Node next;
	public Node leftChild;
	public Node rightChild;
	
	public Node(String memberName, int memberAge ) {
		
		this.memberName = memberName;
		this.memberAge = memberAge;
		
	}
	
	
	public void Display(){
		
		// displays the node parameters; memberName and memberAge
		
		System.out.println("Name: "+ memberName);
		System.out.println("Age:  " + memberAge);
		
	}
	

}
