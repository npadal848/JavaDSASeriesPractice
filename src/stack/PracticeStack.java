package stack;

import java.util.Stack;

public class PracticeStack {

	public static void main(String[] args) {
		
		MyStack<Integer> stack=new MyStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		
		stack.print();
		System.out.println(stack.peek());
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.pop());
		stack.print();
	}
	
}
