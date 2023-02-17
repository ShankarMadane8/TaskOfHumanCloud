package handleAllDataStructure;

import java.util.Scanner;



public class DataStructure {

	public static void main(String[] args) throws Exception {
		DataStructure.AllDataStructure();
	}

	public static void AllDataStructure() throws Exception {
		System.out.println("========= Data Structure =========");
		System.out.println("1. Stack");
		System.out.println("2. Queue");
		System.out.println("3. LinkedList");
		System.out.println("4. Double LinkedList");
		System.out.println("5. Dynamic Array");
		System.out.println("6. System Exist");

		System.out.println("Enter Choice Number:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			StackHandler.displayStack();
			AllDataStructure();
			break;
		}

		case 2: {
			QueueHandler.displayQueue();
			AllDataStructure();
			break;
		}

		case 3: {
			LinkedListHandler.displayLinkedList();
			AllDataStructure();
			break;
		}

		case 4: {
			DoubleLinkedListHandler.displayDoubleLinkedList();
			AllDataStructure();
			break;
		}

		case 5: {
			ArrayHandler.displayArray();
			AllDataStructure();
			break;
		}
		case 6: {
			System.out.println(" End The Application......");
			break;
		}

		default:{
			System.err.println("Inavlid Choice, Please try again");
			AllDataStructure();
		}
		
		}

	}

}
