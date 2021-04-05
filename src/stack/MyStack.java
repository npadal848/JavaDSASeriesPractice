package stack;

import java.util.Arrays;

public class MyStack<E> {
	
	private int intialCapacity=10;
	private Object[] elementData;
	int size;
	
	public MyStack() {
		elementData=new Object[10];
		size=0;
	}

	E push(E e) {
		add(e);
		size++;
		return e;
	}
	
	E pop() {
		E e=peek();
		removeLastElement();
		size--;
		return e;
	}
	
	@SuppressWarnings("unchecked")
	E peek() {
		return (E) elementData[size-1];
	}
	
	void print() {
		int i=0;
		while(elementData[i]!=null) {
			System.out.print(elementData[i]+" ");
			i++;
		}
		System.out.println();
	}
	
	private void removeLastElement() {
		elementData[size-1]=null;
	}
	
	private void add(E e) {
		int newLength=0;
		if(size==elementData.length) {
			newLength=elementData.length+intialCapacity;
			elementData=Arrays.copyOf(elementData, newLength);
			System.out.println("Stack capacity has increased to: "+newLength);
		}
		elementData[size]=e;
	}

}
