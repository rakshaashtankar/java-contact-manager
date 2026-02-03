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
			if(c.getName().toLowerCase().contains(name.toLowerCase())) {
				return c;
			}
		}
		return null;
	}
	
	public boolean deleteById(int id) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getId() == id) {
				contacts.remove(i);
				return true;
			}
		}
		return false;
	}
}
