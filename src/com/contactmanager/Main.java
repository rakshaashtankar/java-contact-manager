package com.contactmanager;

import java.util.Scanner;

import com.contactmanager.model.Contact;
import com.contactmanager.service.ContactService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Contact Manager Started...");
		
		Scanner sc = new Scanner(System.in);
		ContactService contactService = new ContactService();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("\n=== Contact Manager ===");
			System.out.println("1. Add Contact");
			System.out.println("2. View All Contacts");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter Phone: ");
				String phone = sc.nextLine();
				
				System.out.println("Enter Email: ");
				String email = sc.nextLine();
				
				Contact newContact = new Contact(0, name, phone, email);
				contactService.addContact(newContact);
				break;
			
			case 3:
				exit = true;
				System.out.println("Exiting Contact Manager...");
				break;
			default:
				System.out.println("Invalid choice. Try again");

			}
		}
		sc.close();
	}

}