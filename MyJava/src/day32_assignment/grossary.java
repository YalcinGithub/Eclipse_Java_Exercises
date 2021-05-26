package day32_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class grossary {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		boolean flag = true;
		menu();

		while (flag) {

			System.out.println("Enter your choice: ");
			int choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 0: {
				menu();
				break;
			}
			case 1: {
				print(list);
				break;
			}
			case 2: {
				add(list);
				break;
			}
			case 3: {
				modify(list);
				break;
			}
			case 4: {
				remove(list);
				break;
			}
			case 5: {
				search(list);
				break;
			}
			case 6: {
				flag = false;
				break;
			}
			default:
				System.out.println("Unexpected value: " + choice);
			}
		}
	}

	private static void modify(ArrayList<String> list) {
		print(list);
		System.out.println("Enter the product number to change: ");
		int number = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the new product: ");
		String newproduct = scan.nextLine();

		list.set(number - 1, newproduct);
	}

	private static void remove(ArrayList<String> list) {
		print(list);
		System.out.println("Enter the product number to remove: ");
		int number = scan.nextInt();
		scan.nextLine();
		list.remove(number - 1);
	}

	public static void add(ArrayList<String> list) {
		System.out.print("Please enter the grocery item:");
		String newproduct = scan.nextLine();
		list.add(newproduct);
	}

	public static void menu() {
		System.out.println("Press");
		System.out.println("0 - To print choice options.");
		System.out.println("1 - To print the list of grocery items.");
		System.out.println("2 - To add an item to the list.");
		System.out.println("3 - To modify an item in the list.");
		System.out.println("4 - To remove an item from the list.");
		System.out.println("5 - To search an item from the list.");
		System.out.println("6 - To quit the application.");
	}

	public static void print(ArrayList<String> list) {
		if (list.size() < 1) {
			System.out.println("You have 0 items in your grocery list");
		} else {
			System.out.println("You have " + list.size() + " items in your grocery list:");
			for (int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + ". " + list.get(i));
			}

		}

	}

	public static void search(ArrayList<String> list) {
		System.out.print("Please enter the item name:");

		String item = scan.nextLine();
		if (list.contains(item)) {
			System.out.println("Found " + item + " in our grocery list");

		} else {
			System.out.println(item + " is not found.");
		}
	}

}
