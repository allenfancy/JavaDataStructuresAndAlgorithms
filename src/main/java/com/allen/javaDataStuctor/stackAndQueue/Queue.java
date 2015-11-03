package com.allen.javaDataStuctor.stackAndQueue;
/**
 * 
 * @author allen
 *
 * 队列的效率：
 * 	队列中插入数据和删除数据的时间复杂度为O(1).
 * 
 */
public class Queue {

	private int maxSize;
	
	private long[] queryArray;
	
	private int front;
	
	private int rear;
	
	private int nItems;
	
	public Queue(int s){
		maxSize = s;
		queryArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long value){
		if(rear == maxSize - 1)
			rear = -1;
		queryArray[++rear] = value;
		nItems++;
	}
	
	public long remove(){
		long temp = queryArray[front++];
		if(front == maxSize){
			front = 0;
		}
		nItems --;
		return temp;
	}
	
	public long peekFront(){
		return queryArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public boolean isFull(){
		return nItems == maxSize;
	}
	
	public int size(){
		return nItems;
	}
	
}
