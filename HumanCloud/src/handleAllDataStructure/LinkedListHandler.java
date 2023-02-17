package handleAllDataStructure;

import java.util.Scanner;

import customeException.EmptyLinkedListException;
import customeException.LinkedListIndexOutOfBoundException;
import dataStructure.CustomeLinkedList;


public class LinkedListHandler {
	
static CustomeLinkedList linkedList=new CustomeLinkedList();
	
	public static void displayLinkedList(){
		System.out.println();
		System.out.println("--------LinkedList Data Structure----------");
		System.out.println("1. insert");
		System.out.println("2. delete");
		System.out.println("3. delete by Index");
		System.out.println("4. disaply");
		System.out.println("5. Back");
		
		System.out.println("Enter Choice Number:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			System.out.println("enter val:");
			int val=sc.nextInt();
			linkedList.insert(val);
			System.out.println("insert value successfully...");
			displayLinkedList();
			break;
		}
		
        case 2: {
        	try {
				linkedList.delete();
				System.out.println("delete value successfully...");
			} catch (EmptyLinkedListException e) {
				e.printStackTrace();
			}
        	
        	displayLinkedList();
			break;
		}
        
        case 3: {
        	System.out.println("enter index:");
			int index=sc.nextInt();
			try {
				linkedList.delete(index);
				System.out.println("delete value successfully by index...");
			} catch (LinkedListIndexOutOfBoundException | EmptyLinkedListException e) {
				e.printStackTrace();
			}
			
			displayLinkedList();
			break;
		}
        
        case 4: {
        	try {
				linkedList.display();
			} catch (EmptyLinkedListException e) {
				e.printStackTrace();
			}
        	displayLinkedList();
			break;
		}
        
        case 5: {			
			break;
		}
        
        default:{
			System.err.println("Inavlid Choice, Please try again");
			displayLinkedList();
		}
		}
	}

}
