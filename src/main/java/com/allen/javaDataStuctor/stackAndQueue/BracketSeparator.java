package com.allen.javaDataStuctor.stackAndQueue;

public class BracketSeparator {

	private String input;
	
	public BracketSeparator(String in){
		input = in;
	}
	
	public void check(){
		int stackSize = input.length();
		StackSeparator ss = new StackSeparator(stackSize);
		for(int i = 0; i< stackSize;i++){
			char ch = input.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':
				ss.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!ss.isEmpty()){
					char chx = ss.pop();
					if((ch=='}' && chx!='{') ||
							(ch==']' && chx!='[') ||
							(ch==')' && chx!='(') ){
						System.out.println("Error:" +ch+ " at " +i);
					}else{
						System.out.println("Error : " +ch + "at" + i);
					}
				}
				break;
			default:
				break;
			}
		}
		if(!ss.isEmpty()){
			System.out.println("Error : missing right delimiter");
		}
		
	}
}
