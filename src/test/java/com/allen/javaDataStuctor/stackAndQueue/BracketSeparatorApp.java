package com.allen.javaDataStuctor.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketSeparatorApp {

	public static void main(String[] agrs) throws IOException{
		String input;
		while(true){
			System.out.println("Enter string containing delimiters: ");
			System.out.flush();
			input = getString();
			if(input.equals("")){
				break;
			}
		  BracketSeparator bs = new BracketSeparator(input);
		  bs.check();
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
