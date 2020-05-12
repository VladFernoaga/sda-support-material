package ro.unitbv.linkedlist;

public class Node {

	 Object value;
	 Node refNext;
	 Node refPrev;
	 
	public Node(Object value, Node refNext, Node refPrev) {
		this.value = value;
		this.refNext = refNext;
		this.refPrev = refPrev;
	}
}
