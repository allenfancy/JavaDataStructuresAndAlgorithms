package com.allen.javaDataStuctor.stackAndQueue;

public class QueueTest {

	public static void main(String[] args){
		Queue theQueue  = new Queue(5);
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.insert(50);
		
		System.out.println(theQueue.isEmpty());
		System.out.println(theQueue.isFull());
		System.out.println(theQueue.peekFront());
		//remove the front 3 items
		theQueue.remove();
		theQueue.remove();
		theQueue.remove();
		
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
	}
}
