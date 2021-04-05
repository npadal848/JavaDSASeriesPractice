package queue;

public class MyQueue<E> {
	
	Node<E> head,tail;
	
	public boolean offer(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head==null) {
			head=tail=toAdd;
			return true;
		}else {
			tail.next=toAdd;
			tail=tail.next;
			return true;
		}
	}
	
	public E poll() {
		if(head==null) {
			return null;
		}
		
		Node<E> temp=head;
		head=head.next;
		
		if(head.next==null) {
			tail=null;
		}
		return temp.data;
	}
	
	public E peek() {
		return head.data;
	}
	
	public void print() {
		
		if(head==null) {
			return;
		}
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static class Node<E> {
		
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data=data;
			next=null;
		}
	}

}
