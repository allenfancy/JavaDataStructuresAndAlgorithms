package com.allen.javaDataStuctor.Link;
/**
 * 
 * @author allen
 * 链表的基本概念：
 * 	 如果不需要频繁通过下标随机访问各个数据，都可以使用链表来代替数组
 *   在链表中，每个数据项都被包含在"链接点"中，每个Link对象中都包含一个对下一个链节点引用的字段。但是链表本身的对象中哟一个字段指向对第一个链结点的引用
 *   
 * 1.单链表：
 * 	 在链表头插入一个数据
 *   在链表头删除一个数据
 *   遍历链表显示它的内容
 *
 */
public class Link {

	public int iData;
	public double dData;
	public Link next;
	
	public Link(int iData,double dData){
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink(){
		System.out.println("{"+iData+","+dData+"}");
	}
}
