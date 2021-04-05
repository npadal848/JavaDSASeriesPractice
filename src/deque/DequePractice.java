package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
	
	public static void main(String[] args) {
		
		Deque<Integer> dq=new ArrayDeque<>();
		dq.offer(12);
		dq.offer(13);
		dq.offer(14);
		
		System.out.println(dq);
		System.out.println(dq.peek());
		
		System.out.println("====================");
		
		MyDeque<Integer> myDeque=new MyDeque<>();
		myDeque.offer(12);
		myDeque.offer(13);
		myDeque.offer(14);
		
		myDeque.print();
		myDeque.push(11);
		myDeque.print();
		
		myDeque.removeFirst();
		myDeque.print();
		
		myDeque.removeLast();
		myDeque.print();
		
		myDeque.push(11);
		myDeque.print();
		
		myDeque.offer(14);
		myDeque.print();
	}

}
