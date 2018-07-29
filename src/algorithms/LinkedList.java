package algorithms;

public class LinkedList {
	LinkedListNode head;
	int listLength = 0;
	
	public void addNodeAtBegin(int data) {
		LinkedListNode node = new LinkedListNode(data);
		
		if(listLength == 0) {
			head = node;
		}else {
			node.next = head;
			head = node;	
		}
		listLength += 1;
	}
	
	public void displayList() {
		if(listLength > 0) {
			LinkedListNode node = head;
			while(node != null) {
				System.out.println(node.data);
				node = node.next;
			}
		}
	}
}
