package ro.unitbv.linkedlist;

public class LinkedList {


	private int size=0;
	private Node startNode;
	private Node currentNode;
	
	
	/**
	 * Adds an value at the end of the list 
	 * @param value
	 */
	public void add(Object value) {
		if(startNode== null) {
			startNode = new Node(value, null, null);
			currentNode = startNode;
		}else {
			currentNode.refNext = new Node(value, null, currentNode);
			currentNode = currentNode.refNext;
		}
		size++;
	}
	
	/**
	 * Delete BY Node
	 * @param node
	 */
	public void delete(Node node) {
		
	}
	
	/**
	 * Delete BY index
	 * @param node
	 */
	public void deleteIndex(int index) {
		if(index>size) {
			throw new RuntimeException("Index greater than size");
		}
		int count=0;
		Node localCurrentNode = startNode;
		
		//find
		while(count !=index) {
			localCurrentNode = startNode.refNext;
			count++;
		}
		
		// delete
		delete(localCurrentNode);
	}
	
	/**
	 * Delete BY Value
	 * 
	 * @param node
	 */
	public void delete(Object value) {
		
	}
}
