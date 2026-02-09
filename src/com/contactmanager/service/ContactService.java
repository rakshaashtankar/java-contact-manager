package com.contactmanager.service;

import java.util.ArrayList;
import java.util.List;

import com.contactmanager.model.Contact;

public class ContactService {
	
	private List<Contact> contacts = new ArrayList<>();
	private int counter = 1;
	
	private boolean isValidName(String name) {
		return name != null && !name.trim().isEmpty();
	}
	
	private boolean isValidPhone(String phone) {
		return phone != null && phone.matches("\\d{10}");
	}
	
	private boolean isValidEmail(String email) {
		return email != null && email.contains("@") && email.contains(".");
	}
	
	private boolean isValidContact(Contact contact) {
		if(contact == null) return false;
		return isValidName(contact.getName()) &&
		   isValidPhone(contact.getPhone()) &&
		   isValidEmail(contact.getEmail());
			
	}
	
	//Add Contact
	public boolean addContact(Contact contact) {
		if(!isValidContact(contact)) return false;
		contact.setId(counter++);
		contacts.add(contact);
		return true;
	}
	
	public List<Contact> getAllContacts(){
		return new ArrayList<>(contacts);
	}
	
	public Contact searchByName(String name) {
		if(name == null || name.trim().isEmpty()) return null;
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
	
	public boolean updateContact(Contact updatedContact) {
		if(!isValidContact(updatedContact)) return false;
		for(Contact c : contacts) {
			if(c.getId() == updatedContact.getId()) {
				c.setName(updatedContact.getName());
				c.setPhone(updatedContact.getPhone());
				c.setEmail(updatedContact.getEmail());
				return true;
			}
		}
		return false;
	}
}
