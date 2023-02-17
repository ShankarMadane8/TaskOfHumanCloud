package handleAllDataStructure;

import java.util.Scanner;

import customeException.DoubleLinkedListIndexOutOfBoundException;
import customeException.EmptyDoubleLinkedListException;
import dataStructure.CustomeDoubleLinkedList;


public class DoubleLinkedListHandler {
	
	static CustomeDoubleLinkedList doubleLinkedList=new CustomeDoubleLinkedList();
	
	public static void displayDoubleLinkedList()  {
		System.out.println();
		System.out.println("-------- Double LinkedList Data Structure----------");
		System.out.println("1. addInEnd");
		System.out.println("2. addInBegining");
		System.out.println("3. delete in Forward direction");
		System.out.println("4. delete in Forward direction by index");
		System.out.println("5. delete in Backword direction");
		System.out.println("6. display in Forward direction");
		System.out.println("7. display in Backword direction");
		System.out.println("8. Back");
		
		System.out.println("Enter Choice Number:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		

		switch (choice) {
		case 1: {
			System.out.println("enter val:");
			int val=sc.nextInt();
			doubleLinkedList.addInEnd(val);
			System.out.println(" value addInEnd successfully...");
			displayDoubleLinkedList();
			break;
		}
		
        case 2: {
        	System.out.println("enter val:");
			int val=sc.nextInt();
			doubleLinkedList.addInBegining(val);
			System.out.println(" value addInBegining successfully...");
			displayDoubleLinkedList();
			break;
		}
        
        case 3: { 
			try {
				doubleLinkedList.deleteForward();
				System.out.println("delete value Forward direction successfully ...");
			} catch (EmptyDoubleLinkedListException e) {
				e.printStackTrace();
			}
			
			displayDoubleLinkedList();
			break;
		}
        
        case 4: {
        	System.out.println("enter index:");
			int index=sc.nextInt();
			try {
				doubleLinkedList.deleteForward(index);
				System.out.println("delete value Forward direction successfully by index ...");
			} catch (EmptyDoubleLinkedListException | DoubleLinkedListIndexOutOfBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			displayDoubleLinkedList();
			break;
		}
        
        case 5: { 
			try {
				doubleLinkedList.deleteInBackword();
				System.out.println("delete value Backword direction successfully ...");
			} catch (EmptyDoubleLinkedListException e) {
				e.printStackTrace();
			}
			
			displayDoubleLinkedList();
			break;
		}
        
        case 6: {
        	try {
        		System.out.println("dispaly value Forword Direction:");
				doubleLinkedList.displayForward();
			} catch (EmptyDoubleLinkedListException e) {		
				e.printStackTrace();
			}
        	displayDoubleLinkedList();
			break;
		}
        
        case 7: {        	
        	try {
        		System.out.println("dispaly value Backword Direction:");
				doubleLinkedList.displayBackword();
			} catch (EmptyDoubleLinkedListException e) {
				e.printStackTrace();
			}
        	displayDoubleLinkedList();
			break;
		}
        
        case 8: {
        	// for back operation
			break;
		}
        default:{
			System.err.println("Inavlid Choice, Please try again");
			displayDoubleLinkedList();
		}
	
	}
		
		
	}

}
