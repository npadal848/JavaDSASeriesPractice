package linkedlist;

public class MyLinkedList {
	
	Node head;
	int size;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	void add(int data) {
		
		Node toAdd=new Node(data);
		
		if(head==null) {
			head=toAdd;
			size++;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
		size++;
	}
	
	void print() {
		if(head==null) return;
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
