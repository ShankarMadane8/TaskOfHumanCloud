package handleAllDataStructure;

import java.util.Scanner;

import customeException.EmptyQueueException;
import dataStructure.CustomeDynamicQueue;

public class QueueHandler {
	
 	static CustomeDynamicQueue queue=new CustomeDynamicQueue(5);
	
	public static void displayQueue() {
		System.out.println();
		System.out.println("--------Queue Data Structure----------");
		System.out.println("1.enQueue");
		System.out.println("2.deQueue");
		System.out.println("3.display");
		System.out.println("4.Back");
		
		System.out.println("Enter Choice Number:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		
		
		
		switch (choice) {
		case 1: {
			System.out.println("Enter val:");
			int val=sc.nextInt();
			queue.enQueue(val);
			System.out.println("val add successfully...");
			displayQueue();
			break;
		}
		
        case 2: {
        
			try {
				int val = queue.deQueue();
				System.out.println("deQueue val: "+val);
			} catch (EmptyQueueException e) {
				
				e.printStackTrace();
			}
        	
        	displayQueue();
			break;
		}
        
        case 3: {
			System.out.println("all values: ");
			try {
				queue.display();
			} catch (EmptyQueueException e) {
				e.printStackTrace();
			}
			displayQueue();
			break;
		}
        
        case 4: {			
			break;
		}
        
        default:{
			System.err.println("Inavlid Choice, Please try again");
			displayQueue();
		}
		
	}
		
	}

}
