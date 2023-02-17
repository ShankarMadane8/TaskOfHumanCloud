package handleAllDataStructure;

import java.util.Scanner;

import customeException.EmptyArrayException;
import customeException.EmptyQueueException;
import dataStructure.CustomeDynamicArray;

public class ArrayHandler {
    
	static CustomeDynamicArray array=new CustomeDynamicArray();
	
	public static void displayArray() {
		System.out.println();
		System.out.println("--------Dyanmic Array Data Structure----------");
		System.out.println("1. append");
		System.out.println("2. delete");
		System.out.println("3. delete by index");
		System.out.println("4. dispaly");
		System.out.println("5. Back");
		
		System.out.println("Enter Choice Number:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			System.out.println("enter val:");
			int val=sc.nextInt();
			array.append(val);
			System.out.println("add value Successfully...");
			displayArray();
			break;
		}
		
        case 2: {
			try {
				array.delete();
				System.out.println("delete value Successfully....");
			} catch (EmptyArrayException e) {
				e.printStackTrace();
			}
			displayArray();
			break;
		}
        
        case 3: {
			System.out.println("enter index:");
			int index=sc.nextInt();
			try {
				array.delete(index);
				System.out.println("delete value Successfully....");
			} catch (Exception e) {				
				e.printStackTrace();
			}
			displayArray();
			break;
		}
        
        case 4: {
        	try {
        		System.out.println("All values:");
				array.dispaly();
			} catch (EmptyArrayException e) {
				e.printStackTrace();
			}
        	displayArray();
			break;
		}
        
        case 5: {
        	//For Back operation
			break;
		}
        
        default:{
			System.err.println("Inavlid Choice, Please try again");
			
		}
		
	}
		
	}
	
	
}
