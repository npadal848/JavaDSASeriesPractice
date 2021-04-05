package deque;

import java.util.NoSuchElementException;

public class MyDeque<E> {

	Node<E> head;
	Node<E> tail;

	public void offer(E data) {
		addLast(data);
	}
	
	public void push(E data) {
		addFirst(data);
	}
	
	public E peek() {
		return head.data;
	}

	public E removeFirst() throws NoSuchElementException {
		
		if(head==null) throw new NoSuchElementException();
		
		Node<E> temp = head;
		head=temp.next;
		head.prev=null;
		
		return temp.data;
	}
	
	public E removeLast() {
		if(head==null) throw new NoSuchElementException();
		
		Node<E> temp=tail;
		tail=temp.prev;
		tail.next=null;
		
		return temp.data;
	}
	private void addLast(E data) {
		Node<E> toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
			return;
		}
		Node<E> temp=tail;
		tail.next=toAdd;
		tail=tail.next;
		tail.prev=temp;
	}
	
	private void addFirst(E data) {
		Node<E> toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
			return;
		}
		Node<E> temp=head;
		head=toAdd;
		head.next=temp;
	}

	public void print() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static class Node<E> {

		E data;
		Node<E> next;
		Node<E> prev;

		public Node(E data) {
			this.data = data;
			next = prev = null;
		}
	}

}
