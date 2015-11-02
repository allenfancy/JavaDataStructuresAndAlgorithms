package com.allen.javaDataStuctor.stackAndQueue;
/**
 * 字符串反转
 * @author allen
 *
 */
public class StackCharacter {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackCharacter(int max){
		maxSize = max;
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
