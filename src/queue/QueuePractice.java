package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		
		Queue<Integer>  q=new ArrayDeque<>();
		q.offer(12);
		q.offer(13);
		q.offer(14);
		
		System.out.println(q.peek());
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		System.out.println("=============================");
		
		MyQueue<Integer> queue=new MyQueue<>();
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		
		System.out.println(queue.peek());
		queue.print();
		
		queue.poll();
		queue.print();
	}
}
