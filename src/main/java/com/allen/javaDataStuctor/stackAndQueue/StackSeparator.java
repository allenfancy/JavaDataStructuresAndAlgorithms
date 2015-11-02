package com.allen.javaDataStuctor.stackAndQueue;
/***
 * 
 * @author allen
 * 分隔符匹配
 */
public class StackSeparator {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackSeparator(int s){
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char c){
		stackArray[++top] = c;
	}
	public char pop(){
		return stackArray[top--];
	}
	public char peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	
	
	
}
