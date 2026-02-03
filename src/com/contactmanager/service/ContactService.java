package com.contactmanager.service;

import java.util.ArrayList;
import java.util.List;

import com.contactmanager.model.Contact;

public class ContactService {
	
	private List<Contact> contacts = new ArrayList<>();
	private int counter = 1;
	
	//Add Contact
	public void addContact(Contact contact) {
		contact.setId(counter);
		counter++;
		contacts.add(contact);
		System.out.println("Contact added successfully with id: " + contact.getId() + " and contact name: " + contact.getName());
		
	}
	
	public List<Contact> getAllContacts(){
		return contacts;
	}
	
	public Contact searchByName(String name) {
		for(Contact c : contacts) {
			if(c.getName().equalsIgnoreCase(name)  || c.getName().contains(name)) {
				return c;
			}
		}
		return null;
	}
	
	public boolean deleteById(int id) {
		if(contacts == null) return false;
		for(Contact c : contacts) {
			if(c.getId() == id) {
				contacts.remove(c);
				return true;
			}
		}
		return false;
	}
}
