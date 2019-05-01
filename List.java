package Swe510Hw;

public abstract class List {
	
	// this abstract class is extended from all other lists except binarysearchtree
	
	
	// create new node by adding memberName and memberAge
	public abstract void insert(String memberName, int memberAge);
	
	// create new node by adding memberName and memberAge to the given index
	public abstract void insertTo(String memberName, int memberAge, int index);
	
	// create new node to the beginning by adding memberName and memberAge
	public abstract void insertBeginning(String memberName, int memberAge);
	
	// delete a node at the given index
	public abstract void deleteMemberAt(int index);
	
	// delete a node by memberName, it returns true or false
	public abstract boolean deleteByName(String memberName);
	
	// delete all nodes and clean list
	public abstract void deleteAll();
	
	// search node by memberName, it returns true or false
	public abstract boolean searchMember(String memberName);
	
	// list all nodes 
	public abstract void display();
	
	
}
