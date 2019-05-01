package Swe510Hw;


import java.util.InputMismatchException;
import java.util.Scanner; 


public class TakeHomeHw {

	private static LinkedList myLinkedList;
	private static LinkedListStack myLinkedListStack;
	private static LinkedListQueue myLinkedListQueue;
	
	private static ArrayList myArrayList;
	private static ArrayListStack myArrayListStack;
	private static ArrayListQueue myArrayListQueue;
	
	private static BinarySearchTree myBinarySearchTree;

	public static void main(String[] args) {
		

		myLinkedList = new LinkedList();
		myLinkedListStack = new LinkedListStack();
		myLinkedListQueue = new LinkedListQueue();
		
		myArrayList = new ArrayList();
		myArrayListStack = new ArrayListStack();
		myArrayListQueue = new ArrayListQueue();
		
		myBinarySearchTree = new BinarySearchTree();
		
		
		
		// List main menu. 
		messageWelcome();
		
		

	}
	
	
	//------ArrayList Methods
	
	// Insert a new node (member) to the end of the arrayList.
	public static void arrayListInsertMember() {
		
		
		
		System.out.println("\nYou are about to add a new member to arrayList.");
		
		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		myArrayList.insert(writtenName, writtenAge);
		
		System.out.println("\n\u2713 Member has been added succesfully.");

		messageArrayListMethods();
	}
	
	// Insert a new node (member) to the given index of arrayList.
	public static void arrayListInsertMemberTo() {

		int total = myArrayList.getSize();
		
		System.out.println("\nYou are about to add a new member to arrayList with an index .");
		
		if(total == 0) {
			System.out.println("You need to choose an index (you can only use: 0).");
		}else{
			System.out.println("You need to choose an index between 0 and "+(total)+".");
		}
		
		int writtenIndex = writeAnInt("Write a number for index");
		
		// check if given index is really available
		if(writtenIndex >= 0 && writtenIndex <= total) {
			
			String writtenName =  writeString("Write a name for member");
			
			System.out.println("\nNow you need to choose a age for member.");
		
			int writtenAge =  writeAnInt("Write age for member");
			
			myArrayList.insertTo(writtenName,writtenAge,writtenIndex);
			
			System.out.println("\n\u2713 MEmber has been added to " + writtenIndex + ". index succesfully.");
			messageArrayListMethods();
			
		}else {
			messageError("Invalid index. Please try again!");
			arrayListInsertMemberTo();
		}
		
		
	}
	
	// Insert a new node (member) to the beginning of the arrayList.
	public static void arrayListInsertMemberBeginning() {
		
		System.out.println("\nYou are about to add a new member to the beginning of the arrayList.");
		
		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
	
		int writtenAge =  writeAnInt("Write age for member");
		
		myArrayList.insertBeginning(writtenName,writtenAge);

		System.out.println("\n\u2713 Member has been added to the beginning succesfully.");
		messageArrayListMethods();
	}
	
	// Insert 8 new nodes (members) to the arrayList.
	public static void arrayListInsertPredefinedMembers() {
		myArrayList.insert("Ali Keskin",29);
		myArrayList.insert("İlknur Saim",51);
		myArrayList.insert("Tülay Aşkın",34);
		myArrayList.insert("Selim Başpınar",13);
		myArrayList.insert("Hasan Avcı",14);
		myArrayList.insert("Sibel Atmac",35);
		myArrayList.insert("Fatma Öztürk",26);
		myArrayList.insert("Merve Bergen",17);
		
		System.out.println("\n\u2713 8 members have been added succesfully.");
		messageArrayListMethods();
	}
	
	// List all nodes (members) inside the arrayList.
	public static void arrayListDisplayMembers() {
		
		myArrayList.display();
		messageArrayListMethods();
		
	}
	
	// Delete a nodes (members) by memberName from the arrayList if such member exists.
	public static void arrayListDeleteMember() {
		
		int total = myArrayList.getSize();

		
		if(total == 0) {
			messageError("You can't delete a member. ArrayList is empty!");
		}else{
			
			System.out.println("\nYou are about to delete a member of the arrayList.");
			
			String writtenName =  writeString("Choose a member name");
			
			boolean result =  myArrayList.deleteByName(writtenName);
			
			if(result == false) {
				messageError("Member couldn't found! Please try again.");
			}
			
		}
		
		messageArrayListMethods();
		
	}
	
	// Delete all nodes (members) inside the arrayList.
	public static void arrayListDeleteAll() {
		myArrayList.deleteAll();
		messageArrayListMethods();
		
	}
	
	// Deletes a nodes (members) by index from the arrayList if such index exists.
	public static void arrayListDeleteMemberAt() {
		
		int total = myArrayList.getSize();

		System.out.println("\nYou are about to delete member from arrayList with an index .");
		
		if(total == 0) {
			messageError("You can't delete a member. ArrayList is empty!");
	
		}else{
			System.out.println("You need to choose an index between 0 and "+(total-1)+".");
			
			int writtenIndex = writeAnInt("Write a number for index");
			
			if(writtenIndex >= 0 && writtenIndex <= (total-1)) {
				
				myArrayList.deleteMemberAt(writtenIndex);
				System.out.println("\n\u2713 Member has been deleted from " + writtenIndex + ". index succesfully.");
				messageArrayListMethods();
				
			}else {
				messageError("Invalid index. Please try again!");
				arrayListDeleteMemberAt();
			}
				
			
		}
		messageArrayListMethods();
	}
	
	// Search arrayList's nodes (members) by memberName and prints if exits.
	public static void arrayListSearch() {
		System.out.println("\nYou are about search member in ArrayList .");
		
		String writtenName =  writeString("Write a name to search");
		
		boolean result =  myArrayList.searchMember(writtenName);
		
		if(result == false) {
			messageError(writtenName + " couldn't found! Please try again.");
		}
		
		messageArrayListMethods();
	}
		
	
	
	
	//----- LinkedList Methods
	
	
	// Insert 8 new nodes (members) to the linkedList.
	public static void linkedListInsertPredefinedMember() {
		
		myLinkedList.insert("Sibel Kara", 29);
		myLinkedList.insert("Ahmet Yılmaz", 26);
		myLinkedList.insert("Erkin Koray", 18);
		myLinkedList.insert("Batu Taşdelen", 42);
		myLinkedList.insert("Jülide Tezcan", 31);
		myLinkedList.insert("Ayda Sarığlu", 23);
		myLinkedList.insert("Burak Akad", 19);
		myLinkedList.insert("Leyla Çoban", 35);
		
		System.out.println("\n\u2713 8 predefined members added succesfully.");
		messageLinkedListMethods();
		
	}
	
	// Insert a new node (member) to the end of the linkedList.
	public static void linkedListInsertMember() {
		
		
		System.out.println("\nYou are about to create a new member to linkedList.");
		
		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		myLinkedList.insert(writtenName, writtenAge);
		
		System.out.println("\n\u2713 Member has been added succesfully.");
		messageLinkedListMethods();
		
		
		
	}
	
	// Insert a new node (member) to the beginning of the linkedList.
	public static void linkedListInsertMemberToBeginning() {
		
		System.out.println("\nYou are about to create a new member to the beginning of the linkedList.");
		
		
		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
	
		int writtenAge =  writeAnInt("Write age for member");
		
		myLinkedList.insertBeginning(writtenName, writtenAge);
		
		System.out.println("\n\u2713 Member has been added to the beginning succesfully.");
		messageLinkedListMethods();
	}
	
	// List all nodes (members) inside the linkedList.
	public static void linkedListDisplayMembers() {
		myLinkedList.display();
		messageLinkedListMethods();
	}
	
	// Insert a new node (member) to the given index of linkedList.
	public static void linkedListInsertMemberTo() {
		
		int total = myLinkedList.getCountMembers();
		
		System.out.println("\nYou are about to create a new member with an index to linkedList.");
		
		if(total == 0) {
			System.out.println("You need to choose an index (you can only use: 0): ");
		}else{
			System.out.println("You need to choose an index between 0 and "+(total)+": ");
		}
		
		int writtenIndex = writeAnInt("Write a number for index");
		
		// check if given index is available
		if(writtenIndex >= 0 && writtenIndex <= total) {
			
			String writtenName =  writeString("Write a name for member");
			
			System.out.println("\nNow you need to choose a age for member.");
			
			int writtenAge =  writeAnInt("Write age for member");
			
			myLinkedList.insertTo(writtenName, writtenAge,writtenIndex);
			
			System.out.println("\n\u2713 Member has been added succesfully.");
			messageLinkedListMethods();
		
		}else {
			messageError("Invalid index. Please try again!");
			messageLinkedListMethods();
		}
		
	}
	
	// Delete a nodes (members) by memberName from the linkedList if such member exists.
	public static void linkedListDeleteMemberByName() {
		
		System.out.println("\nYou are about to delete a member of the linkedList.");
		
		String writtenName =  writeString("Choose a member name");
		
		boolean result =  myLinkedList.deleteByName(writtenName);
		
		if(result == false) {
			messageError("No member found! Please try again.");
		}
		
		messageLinkedListMethods();
		
	}
	
	// Delete a nodes (members) by index from the linkedList if such index exists.
	public static void linkedListDeleteMemberByIndex() {
		
		// check if linkedList is empty or not
		if(myLinkedList.isEmpty()) {
			messageError("The LinkedList is empty. You can't delete any member.");
			messageLinkedListMethods();
		}else{
		
			int total = myLinkedList.getCountMembers();
			
			System.out.println("\nYou are about to delete a member of the linkedList.");
			System.out.print("Please choose an index between 0 and "+(total - 1)+": ");
			
			
			int writtenIndex = writeAnInt("Write a number for index");
			
			// check if given index is really occurs in linkedList
			if(writtenIndex<0 || writtenIndex> (total-1)) {
				messageError("You've entered an invalid index! \nPlease try again.");
				linkedListDeleteMemberByIndex();
			}else {

				myLinkedList.deleteMemberAt(writtenIndex);
				messageLinkedListMethods();

			}
			
		
		}
		
	}
	
	// Delete all nodes (members) inside the linkedList.
	public static void linkedListDeleteAllMembers() {
		
		myLinkedList.deleteAll();
		messageLinkedListMethods();
		
	}
	
	// Search linkedList's nodes (members) by memberName and prints if exits.
	public static void linkedListSearchByName() {
		
		System.out.println("\nYou are about to search a member of the linkedList.");
		
		String writtenName =  writeString("Choose a member name");
		
		boolean result =  myLinkedList.searchMember(writtenName);
		
		if(result == false) {
			messageError("No member found with a name: "+ writtenName +"! Please try again.");
		}
		
		messageLinkedListMethods();
		
	}
	
	
	
	
	//----- LinkedListStack Methods
	
	// Insert 8 new nodes (members) to the linkedListStack.
	public static void linkedListStackPushPredefinedMember() {
		
		myLinkedListStack.insert("Umut Yüksel", 17);
		myLinkedListStack.insert("Ayşen Işık", 31);
		myLinkedListStack.insert("Damla Demir", 22);
		myLinkedListStack.insert("Ezgi Damgacı", 52);
		myLinkedListStack.insert("Hakan Ergün", 21);
		myLinkedListStack.insert("Merve Okur", 44);
		myLinkedListStack.insert("Fikri Aydın", 39);
		myLinkedListStack.insert("Özlem Kocaman", 25);
		
		System.out.println("\n\u2713 8 predefined members added succesfully.");
		messageLinkedListStackMethods();
		
	}
	
	// Insert a new node (member) to the top of the linkedListStack.
	public static void linkedListStackPushMember() {
		System.out.println("\nYou are about to creat and push a new member to linkedListStack.");
		
		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		myLinkedListStack.insert(writtenName, writtenAge);
		
		System.out.println("\n\u2713 Member has been added succesfully.");
		messageLinkedListStackMethods();
	}
	
	// List all nodes (members) inside the linkedListStack.
	public static void linkedListDisplayStackMembers() {
		myLinkedListStack.display();
		messageLinkedListStackMethods();
	}
	
	// Pop node (member) from the top of the linkedListStack and deletes it. LIFO
	public static void linkedListStackPopMember() {
		Node n =  myLinkedListStack.pop();
		
		if( n != null) {
			System.out.println("\n POP Result ***********");
			System.out.println("\u2713 Member name: " + n.memberName);
			System.out.println("\u2713 Member age: " + n.memberAge);
		}else {
			messageError("You can't pop! The LinkedListStack seems empty at all.");
		}
		
		messageLinkedListStackMethods();
		
	}
	
	// Deletes all nodes (members) inside linkedListStack.
	public static void linkedListStackDeleteAllMembers() {
		
		myLinkedListStack.deleteAll();
		messageLinkedListStackMethods();
		
	}
	
	// Search linkedListStack's nodes (members) by memberName and prints if exits.
	public static void linkedListStackSearchByName() {
		System.out.println("\nYou are about to search a member of the linkedListStack.");
		
		String writtenName =  writeString("Choose a member name");
		
		boolean result =  myLinkedListStack.searchMember(writtenName);
		
		if(result == false) {
			messageError("No member found with a name: "+ writtenName +"! Please try again.");
		}
		
		messageLinkedListStackMethods();
	}
	
	
	//----- LinkedListQueue Methods
	
	// Insert 8 new nodes (members) to the linkedListQueue.
	public static void linkedListQueueEnqueuePredefinedMember() {
		
		myLinkedListQueue.insert("Elif Korgan", 23);
		myLinkedListQueue.insert("Faruk Öncü", 18);
		myLinkedListQueue.insert("Burcu Şenol", 58);
		myLinkedListQueue.insert("Meryem Yıldırım", 42);
		myLinkedListQueue.insert("Eren Sazak", 37);
		myLinkedListQueue.insert("Volkan Bozok", 30);
		myLinkedListQueue.insert("Ayşe Nilay", 29);
		myLinkedListQueue.insert("Recep Ulu", 45);
		
		System.out.println("\n\u2713 8 predefined members added succesfully.");
		messageLinkedListQueueMethods();
		
	}
	
	// Insert a new node (member) to the top of the linkedListQueue.
	public static void linkedListQueueEnqueueMember() {
		System.out.println("\nYou are about to creat and push a new member to linkedListQueue.");
		
		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		myLinkedListQueue.insert(writtenName, writtenAge);
		
		System.out.println("\n\u2713 Member has been added succesfully.");
		messageLinkedListQueueMethods();
	}
	
	// Pop node (member) from the end of the linkedListQueue and deletes it. FIFO
	public static void linkedListQueueDequeueMember() {
		Node n =  myLinkedListQueue.dequeue();
		
		if( n != null) {
			System.out.println("\n Dequeu Result ***********");
			System.out.println("\u2713 Member name: " + n.memberName);
			System.out.println("\u2713 Member age: " + n.memberAge);
		}else {
			messageError("You can't dequeue! The LinkedListQueue seems empty at all.");
		}
		
		messageLinkedListQueueMethods();
		
	}
	
	// Delete all nodes (members) inside linkedListQueue.
	public static void linkedListQueueDeleteAllMembers() {
		
		myLinkedListQueue.deleteAll();
		messageLinkedListQueueMethods();
		
	}
	
	// List all nodes (members) inside the linkedListQueue.
	public static void linkedListDisplayQueueMembers() {
		myLinkedListQueue.display();
		messageLinkedListQueueMethods();
	}
	
	// Search linkedListQueue's nodes (members) by memberName and prints if exits.
	public static void linkedListQueueSearchByName() {
		System.out.println("\nYou are about to search a member of the linkedListQueue.");
		
		String writtenName =  writeString("Choose a member name");
		
		boolean result =  myLinkedListQueue.searchMember(writtenName);
		
		if(result == false) {
			messageError("No member found with a name: "+ writtenName +"! Please try again.");
		}
		
		messageLinkedListQueueMethods();
	}
	
	
	
	//------ ArrayListStack Methods
	
	// Insert 8 new nodes (members) to the arrayListStack.
	public static void arrayListStackPushPredefinedMembers() {
		
		myArrayListStack.insert("Halime Yüce",34);
		myArrayListStack.insert("Müşerref Sakarya",19);
		myArrayListStack.insert("Fikri Özdemir",61);
		myArrayListStack.insert("Gülten Yılmaz",22);
		myArrayListStack.insert("Zafer Saraç",31);
		myArrayListStack.insert("Yağmur Tuna",25);
		myArrayListStack.insert("Tugba Tuncer",22);
		myArrayListStack.insert("Onur Ceylan",49);
		
		
		System.out.println("\n\u2713 8 members have been added succesfully.");
		messageArrayListStackMethods();
	}
	
	// Insert a new node (member) to the top of the arrayListStack.
	public static void arrayListStackPushMember() {

		System.out.println("\nYou are about to add a new member to arrayListStack.");
		
		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		myArrayListStack.insert(writtenName, writtenAge);
		
		System.out.println("\n\u2713 Member has been added succesfully.");
		messageArrayListStackMethods();
	}
	
	// Pop node (member) from the top of the arrayListStack and deletes it. LIFO
	public static void arrayListStackPopMember() {
		
		
		int size = myArrayListStack.getSize();
		
		if(size == 0) {
			messageError("You can't pop! The ArrayListStack seems empty at all.");
		}else{
			
			Node n =  myArrayListStack.pop();
			
			System.out.println("\n POP Result ***********");
			System.out.println("\u2713 Member Name: " + n.memberName);
			System.out.println("\u2713 Member Age: " + n.memberAge);
			
		}
		

		messageArrayListStackMethods();
		
		
	}
	
	// Delete all nodes (members) inside arrayListStack.
	public static void arrayListStackDeleteAllMembers(){
		myArrayListStack.deleteAll();
		messageArrayListStackMethods();
	}
	
	// Search arrayListStack's nodes (members) by memberName and prints if exits.
	public static void arrayListStackSearch() {
		
		System.out.println("\nYou are about search a member in ArrayListStack.");
		
		String writtenName =  writeString("Write a name for member");
		
		boolean result =  myArrayListStack.searchMember(writtenName);
		
		if(result == false) {
			messageError(writtenName + " couldn't found! Please try again.");
		}
		
		messageArrayListStackMethods();
		
	}
	
	// List all nodes (members) inside the arrayListStack.
	public static void arrayListDisplayStackMembers() {
		myArrayListStack.display();
		messageArrayListStackMethods();
	}
	
	

	//------ ArrayListQueue Methods
	
	// Insert 8 new nodes (members) to the arrayListQueue.
	public static void arrayListQueueEnqueuePredefinedMember() {
		myArrayListQueue.insert("Erol Kılıç",34);
		myArrayListQueue.insert("Feridun Keke",21);
		myArrayListQueue.insert("Handan Ulusoy Ay",23);
		myArrayListQueue.insert("Ceren Turan",45);
		myArrayListQueue.insert("Şeyma Sezer",30);
		myArrayListQueue.insert("Musa Engin",51);
		myArrayListQueue.insert("Güven Çoban",16);
		
		System.out.println("\n\u2713 8 members have been added succesfully.");
		messageArrayListQueueMethods();
	}
	
	// List all nodes (members) inside the arrayListQueue.
	public static void arrayListDisplayQueueMembers() {
		myArrayListQueue.display();
		messageArrayListQueueMethods();
	}
	
	// Insert a new node (member) to the top of the arrayListQueue.
	public static void arrayListQueueEnqueueMember() {

		System.out.println("\nYou are about to add a new member to arrayListQueue.");
		

		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		
		myArrayListQueue.insert(writtenName,writtenAge);
		System.out.println("\n\u2713 Member has been added succesfully.");
		messageArrayListQueueMethods();
	}
	
	// Pops node (member) from the end of the arrayListQueue and deletes it. FIFO
	public static void arrayListQueueDequeueMember() {
		
		int size = myArrayListQueue.getSize();
		
		if(size == 0) {
			messageError("You can't dequeu! The ArrayListQueue seems empty at all.");
		}else{
			
			Node n =  myArrayListQueue.dequeue();
			
			System.out.println("\n Dequeu Result ***********");
			System.out.println("\u2713 Member Name: " + n.memberName);
			System.out.println("\u2713 Member Age: " + n.memberAge);
			
		}
		

		messageArrayListQueueMethods();

		
	}
	
	// Deletes all nodes (members) inside arrayListQueue.
	public static void arrayListQueueDeleteAllMembers() {
		myArrayListQueue.deleteAll();
		messageArrayListQueueMethods();
	}
	
	// Searches arrayListQueue's nodes (members) by memberName and prints if exits.
	public static void arrayListQueueSearch() {
		System.out.println("\nYou are about search a member in ArrayListQueue.");
		
		String writtenName =  writeString("Write a name for member");
		
		boolean result =  myArrayListQueue.searchMember(writtenName);
		
		if(result == false) {
			messageError(writtenName + " couldn't found! Please try again.");
		}
		
		messageArrayListQueueMethods();
	}
	
	
	
	//------ BinarySearchTree Methods
	
	// Insert a new node (member) to the appropriate position in the binarySearchTree.
	public static void binarySearchTreeInsert() {

		System.out.println("\nYou are about to add a new member to binarySearchTree.");
		

		String writtenName =  writeString("Write a name for member");
		
		System.out.println("\nNow you need to choose a age for member.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		
		myBinarySearchTree.insert(writtenName,writtenAge);
		System.out.println("\n\u2713 Member has been added succesfully.");
		messageBinarySearchTreeMethods();
		
	}
	
	// Insert 10 new nodes (members) to the binarySearchTree.
	public static void binarySearchTreeInsertPredefinedMember() {
		
		myBinarySearchTree.insert("Levent Çolak",27);
		myBinarySearchTree.insert("Erol Kılıç",56);
		myBinarySearchTree.insert("Feridun Keke",26);
		myBinarySearchTree.insert("Handan Ulusoy Ay",200);
		myBinarySearchTree.insert("Ceren Turan",190);
		myBinarySearchTree.insert("Şeyma Sezer",18);
		myBinarySearchTree.insert("Musa Engin",28);
		myBinarySearchTree.insert("Serkan Aytepe",213);
		myBinarySearchTree.insert("Seher Kara",12);
		myBinarySearchTree.insert("Sevil Bolulu",24);
		
		
		System.out.println("\n\u2713 10 members have been added succesfully.");
		messageBinarySearchTreeMethods();
	}
	
	// List all nodes (members) inside the binarySearchTree as array.
	// Via infix traversal Left - Parent - Right
	public static void binarySearchTreeDisplay() {
		myBinarySearchTree.showCount();
		myBinarySearchTree.display(myBinarySearchTree.getRoot());
		messageBinarySearchTreeMethods();
	}
	
	// Search node by memberName in the binarySearchTree
	public static void binarySearchTreeSearch() {
		
		System.out.println("\nYou are about search a member in BinarySearchTree.");
		
		String writtenName =  writeString("Write a name for member");
		
		
		myBinarySearchTree.setSearch_found(false);
		myBinarySearchTree.searchMember(writtenName,myBinarySearchTree.getRoot());
		
		
		if(myBinarySearchTree.isSearch_found() == false) {
			messageError(writtenName + " couldn't found! Please try again.");
		}
		
		
		messageBinarySearchTreeMethods();
		
	}
	
	// Delete a node from binarySearchTree by age
	// Returns if deletion is successful or not
	public static void binarySearchTreeDelete() {
		

		
		System.out.println("\nYou are about search a member in BinarySearchTree.");
		
		int writtenAge =  writeAnInt("Write age for member");
		
		
		myBinarySearchTree.setSearch_found(false);
		myBinarySearchTree.deleteMember(writtenAge,myBinarySearchTree.getRoot());
		
		
		
		if(myBinarySearchTree.isSearch_found() == false) {
			messageError(writtenAge + " couldn't found! Please try again.");
		}else {
			System.out.println("\n\u2713 Found and deleted: " + writtenAge);
			myBinarySearchTree.setSize(myBinarySearchTree.getSize() - 1);
		}
		
		messageBinarySearchTreeMethods();
		
		
		
	}
	
	
	
	

	
	
	
	//----- Console Messages
	
	public static void messageWelcome() {

		System.out.println("*****************************");
		System.out.println("*       TAKE HOME EXAM      *");
		System.out.println("*         ENİS ÇOBAN        *");
		System.out.println("*         2018719171        *");
		System.out.println("*****************************");
		
		messageMainOptions();

	}
	
	public static void messageMainOptions() {
		
		
		System.out.println("\n******************** Main Menu ********************");
		System.out.println("What do you want to work on with?");
		
		System.out.println("\n   1- ArrayList");
		System.out.println("   2- LinkedList");
		System.out.println("   3- LinkedListStack");
		System.out.println("   4- LinkedListQueue");
		System.out.println("   5- ArrayListStack");
		System.out.println("   6- ArrayListQueue");
		System.out.println("   7- BinarySearchTree");
		System.out.println("\n****************************************************");
		

	
		String written =  writeString("Choose and press Enter");
		
		 switch (written) {
	        case "1" :
	        	messageArrayListMethods();
	            break;

	        case "2" :
	        	messageLinkedListMethods();
	            break;

	        case "3" :
	        	messageLinkedListStackMethods();
	            break;
	        
	        case "4" :
	        	messageLinkedListQueueMethods();
	            break;

	        case "5" :
	        	messageArrayListStackMethods();
	            break;
	         
	        case "6" :
	        	messageArrayListQueueMethods();
	            break;
	        case "7" :
	        	messageBinarySearchTreeMethods();
	            break;
	            
	        default :
	        	messageError("You entered an invalid option!");
	        	messageMainOptions();
	            break;
	      }
	}
	
	
	public static void messageLinkedListStackMethods() {
		System.out.println("\n***************** LinkedListStack *****************");
		System.out.println("This LinkedListStack is about members and their ages.");
		System.out.println("Here are avaible LinkedListStack methods.");
		
		System.out.println("\n   1- Push predefined 8 Members");
		System.out.println("   2- Push a member");
		System.out.println("   3- Pop a member");
		System.out.println("   4- Delete all members");
		System.out.println("   5- Search a member by name");
		System.out.println("   6- Display all members");
		System.out.println("   0- Back to the main menu");
		
		System.out.println("\n****************************************************");
		
		String written =  writeString("Choose and press Enter");
		
		switch (written) {
		 case "1" :
        	linkedListStackPushPredefinedMember();
            break;
            
        case "2" :
        	linkedListStackPushMember();
            break;

        case "3" :
        	linkedListStackPopMember();
            break;

        case "4" :
        	linkedListStackDeleteAllMembers();
            break;

        case "5" :
        	linkedListStackSearchByName();
            break;
        
        case "6" :
        	linkedListDisplayStackMembers();
            break;   
         
        case "0" :
        	messageMainOptions();
            break;
        default :
        	messageError("You entered an invalid option!");
        	messageLinkedListStackMethods();
            break;
      }
	}
	
	public static void messageLinkedListQueueMethods() {
		System.out.println("\n***************** LinkedListQueue *****************");
		System.out.println("This LinkedListQueue is about members and their ages.");
		System.out.println("Here are avaible LinkedListQueue methods.");
		
		System.out.println("\n   1- Enqueue predefined 8 Members");
		System.out.println("   2- Enqueue a member");
		System.out.println("   3- Dequeue a member");
		System.out.println("   4- Delete all members");
		System.out.println("   5- Search a member by name");
		System.out.println("   6- Display all members");
		System.out.println("   0- Back to the main menu");
		
		System.out.println("\n****************************************************");
		
		String written =  writeString("Choose and press Enter");
		
		switch (written) {
		 case "1" :
        	linkedListQueueEnqueuePredefinedMember();
            break;
            
        case "2" :
        	linkedListQueueEnqueueMember();
            break;

        case "3" :
        	linkedListQueueDequeueMember();
            break;

        case "4" :
        	linkedListQueueDeleteAllMembers();
            break;

        case "5" :
        	linkedListQueueSearchByName();
            break;
        
        case "6" :
        	linkedListDisplayQueueMembers();
            break;   
         
        case "0" :
        	messageMainOptions();
            break;
        default :
        	messageError("You entered an invalid option!");
        	messageLinkedListQueueMethods();
            break;
      }
	}
	
	public static void messageLinkedListMethods() {

		System.out.println("\n******************** LinkedList ********************");
		System.out.println("This LinkedList is about members and their ages.");
		System.out.println("Here are avaible LinkedList methods.");
	

		System.out.println("\n   1- Insert predefined 8 Members");
		System.out.println("   2- Insert a member");
		System.out.println("   3- Insert a member in a certain index");
		System.out.println("   4- Insert a member to the beginning");
		System.out.println("   5- Delete a member by name");
		System.out.println("   6- Delete a member by certain index");
		System.out.println("   7- Delete all members");
		System.out.println("   8- Search a member by name");
		System.out.println("   9- Display all members");
		System.out.println("   0- Back to the main menu");
		
		System.out.println("\n****************************************************");
		
		
		String written =  writeString("Choose and press Enter");
		
		switch (written) {
		 case "1" :
        	linkedListInsertPredefinedMember();
            break;
        case "2" :
        	linkedListInsertMember();
            break;

        case "3" :
        	linkedListInsertMemberTo();
            break;

        case "4" :
        	linkedListInsertMemberToBeginning();
            break;
        
        case "5" :
        	linkedListDeleteMemberByName();
            break;
            
        case "6" :
        	linkedListDeleteMemberByIndex();
            break;

        case "7" :
        	linkedListDeleteAllMembers();
            break;

        case "8" :
        	linkedListSearchByName();
            break;
        
        case "9" :
        	linkedListDisplayMembers();
            break;   
         
        case "0" :
        	messageMainOptions();
            break;
        default :
        	messageError("You entered an invalid option!");
        	messageLinkedListMethods();
            break;
      }
		
	}
	
	public static void messageArrayListMethods() {

		System.out.println("\n******************** ArrayList ********************");
		System.out.println("This ArrayList is about members and their ages.");
		System.out.println("Here are avaible Arraylist methods.");
		
		System.out.println("\n   1- Insert predefined 8 Member");
		System.out.println("   2- Insert a member");
		System.out.println("   3- Insert a member in a certain index");
		System.out.println("   4- Insert a member to the beginning");
		System.out.println("   5- Delete a member by name");
		System.out.println("   6- Delete a member by certain index");
		System.out.println("   7- Delete all members");
		System.out.println("   8- Search a member");
		System.out.println("   9- Display all members");
		System.out.println("   0- Back to the main menu");
		
		System.out.println("\n****************************************************");
		
		String written =  writeString("Choose and press Enter");
		
		
		switch (written) {
		 case "1" :
        	arrayListInsertPredefinedMembers();
            break;
        case "2" :
        	arrayListInsertMember();
            break;

        case "3" :
        	arrayListInsertMemberTo();
            break;

        case "4" :
        	arrayListInsertMemberBeginning();
            break;
        
        case "5" :
        	arrayListDeleteMember();
            break;
            
        case "6" :
        	arrayListDeleteMemberAt();
            break;

        case "7" :
        	arrayListDeleteAll();
            break;

        case "8" :
        	arrayListSearch();
            break;
        
        case "9" :
        	arrayListDisplayMembers();
            break;   
         
        case "0" :
        	messageMainOptions();
            break;
        default :
        	messageError("You entered an invalid option!");
        	messageArrayListMethods();
            break;
      }
		
	}

	public static void messageArrayListStackMethods() {
		System.out.println("\n***************** ArrayListStack *****************");
		System.out.println("This ArrayListStack is about members and their ages.");
		System.out.println("Here are avaible ArrayListStack methods.");
		
		System.out.println("\n   1- Push predefined 8 members");
		System.out.println("   2- Push a member");
		System.out.println("   3- Pop a member");
		System.out.println("   4- Delete all member");
		System.out.println("   5- Search a member");
		System.out.println("   6- Display all members");
		System.out.println("   0- Back to the main menu");
		
		System.out.println("\n****************************************************");
		
		String written =  writeString("Choose and press Enter");
		
		switch (written) {
		 case "1" :
        	arrayListStackPushPredefinedMembers();
            break;
            
        case "2" :
        	arrayListStackPushMember();
            break;

        case "3" :
        	arrayListStackPopMember();
            break;

        case "4" :
        	arrayListStackDeleteAllMembers();
            break;

        case "5" :
        	arrayListStackSearch();
            break;
        
        case "6" :
        	arrayListDisplayStackMembers();
            break;   
         
        case "0" :
        	messageMainOptions();
            break;
        default :
        	messageError("You entered an invalid option!");
        	messageLinkedListStackMethods();
            break;
      }
	}
	
	public static void messageArrayListQueueMethods() {
		System.out.println("\n***************** ArrayListQueue *****************");
		System.out.println("This ArrayListQueue is about members and their ages.");
		System.out.println("Here are avaible ArrayListQueue methods.");
		
		System.out.println("\n   1- Enqueue predefined 8 members");
		System.out.println("   2- Enqueue a member");
		System.out.println("   3- Dequeue a member");
		System.out.println("   4- Delete all members");
		System.out.println("   5- Search a member");
		System.out.println("   6- Display all members");
		System.out.println("   0- Back to the main menu");
		
		System.out.println("\n****************************************************");
		
		String written =  writeString("Choose and press Enter");
		
		switch (written) {
		 case "1" :
        	arrayListQueueEnqueuePredefinedMember();
            break;
            
        case "2" :
        	arrayListQueueEnqueueMember();
            break;

        case "3" :
        	arrayListQueueDequeueMember();
            break;

        case "4" :
        	arrayListQueueDeleteAllMembers();
            break;

        case "5" :
        	arrayListQueueSearch();
            break;
        
        case "6" :
        	arrayListDisplayQueueMembers();
            break;   
         
        case "0" :
        	messageMainOptions();
            break;
        default :
        	messageError("You entered an invalid option!");
        	messageLinkedListQueueMethods();
            break;
      }
	}
	
	public static void messageBinarySearchTreeMethods() {
		System.out.println("\n***************** BinarySearchTree *****************");
		System.out.println("This BinarySearchTree is about members and their ages.");
		System.out.println("Here are avaible BinarySearchTree methods.");
		
		System.out.println("\n   1- Insert predefined 10 members");
		System.out.println("   2- Insert a member");
		System.out.println("   3- Delete a member by age");
		System.out.println("   4- Search a member by name");
		System.out.println("   5- Display all members (Infix Left-Root-Right)");
		System.out.println("   0- Back to the main menu");
		
		System.out.println("\n****************************************************");
		
		String written =  writeString("Choose and press Enter");
		
		switch (written) {
		 case "1" :
        	binarySearchTreeInsertPredefinedMember();
            break;
            
        case "2" :
        	binarySearchTreeInsert();
            break;

        case "3" :
        	binarySearchTreeDelete();
            break;

        case "4" :
        	binarySearchTreeSearch();
            break;

        case "5" :
        	binarySearchTreeDisplay();
            break;
     
         
        case "0" :
        	messageMainOptions();
            break;
        default :
        	messageError("You entered an invalid option!");
        	messageLinkedListQueueMethods();
            break;
      }
	}
	
		
	
	
	
	
	
	
	
	

	
	public static void messageError(String message) {
		
		System.out.println("\n======== An error occured =======");
		System.out.println(message);
		System.out.println("=================================");
		
	}
	

	
	//read string from console
	public static String writeString(String message) {
		
		String writtenString = "";
		boolean isString = false; 
		
		while(!isString){
		
			System.out.print("\n\u2023 "+ message +": ");
			Scanner in = new Scanner(System.in); 
			writtenString = in.nextLine(); 
			if(writtenString.length() == 0) {
				messageError("You entered an invalid string! \nPlease try again.");
			}else {
				isString = true;
			}
		}
		return writtenString;
	}
	
	//read int from console
	public static int writeAnInt(String message) {
		
		int writtenNumber = 0;
		
		  Scanner in = new Scanner(System.in);
		  boolean isNumeric = false; 
		  
		  while(!isNumeric)
		     try {
		    	 
		    	System.out.print("\n\u2023 "+ message +": ");
		        writtenNumber = in.nextInt(); 
		        in.nextLine();
		        isNumeric = true; //numeric value entered, so break
		        

		  } catch(InputMismatchException ime) {
		     
			 messageError("You entered an invalid number! Number couldn't be added.\nPlease try again.");
		     in.nextLine();
		  }
		  return writtenNumber;
		
		
	}


	
	
}
