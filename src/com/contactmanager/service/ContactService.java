package com.contactmanager.service;

import java.util.ArrayList;
import java.util.List;

import com.contactmanager.model.Contact;

public class ContactService {
	
	private ArrayList<Contact> contacts = new ArrayList<>();
	
	public void addContact(Contact contact) {
		
	}
	
	public List<Contact> getAllContacts(){
		return contacts;
	}
	
	public Contact searchByName(String name) {
		return null;
	}
	
	public boolean deleteById(int id) {
		return false;
	}
}
