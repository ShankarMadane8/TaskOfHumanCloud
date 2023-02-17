package handleAllDataStructure;

import java.util.Scanner;

import customeException.EmptyStackException;
import dataStructure.CustomeStack;


public class StackHandler {
	
	static CustomeStack  stack=new CustomeStack();
	
	public static void displayStack() {
		System.out.println();
		System.out.println("--------Stack Data Structure----------");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.println("4.Back");
		
		System.out.println("Enter Choice Number:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
			
				
		switch (choice) {
		case 1: {
			System.out.println("Enter Val:");
			int val=sc.nextInt();
			stack.push(val);
			System.out.println("val push Succesfully...");
			displayStack();
			break;
		}
		
        case 2: {
        	
			try {
				int val = stack.pop();
				System.out.println("data pop successfully : "+val);
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
			displayStack();
			break;
		}
        
        case 3: {
			
			try {
				int val = stack.peek();
				System.out.println("peek val: "+val);
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
			
			displayStack();
			break;
		}
        
        case 4: {	
        	//For Back Operation
			break;
		}
        
		default:{
			System.err.println("Inavlid Choice, Please try again");
			displayStack();
		}
			
		}
		
	}
}	


