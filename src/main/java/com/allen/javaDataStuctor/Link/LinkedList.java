package com.allen.javaDataStuctor.Link;

public class LinkedList {

	private Link first;
	
	public LinkedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insertFirst(int iData,double dData){
		Link newLink = new Link(iData,dData);
		newLink.next = first;
		first = newLink;
	}
	
}
