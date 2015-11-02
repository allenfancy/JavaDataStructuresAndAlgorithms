package com.allen.javaDataStuctor.stackAndQueue;

public class Reverser {

	private String input;
	private String output;
	
	public Reverser(String in){
		input = in;
	}
	
	public String doRev(){
		int stackSize = input.length();
		StackCharacter sc = new StackCharacter(stackSize);
		for(int j = 0;j < input.length();j++){
			char ch = input.charAt(j);
			sc.push(ch);
		}
		output = "";
		while (!sc.isEmpty()) {
			char ch = sc.pop();
			output = output + ch;
		}
		return output;
	}
}
