package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.entities.Contact;

public interface ContactServiceI {

public abstract boolean saveContact(Contact contact);
	
	public abstract List<Contact> getAllContact();
	
	public abstract Contact getContactById(Integer id);
	
	public abstract boolean updateContact(Contact contact);
	
	public abstract boolean deleteContact(Integer id);
	
	public abstract boolean deleteConatctSoft(Integer id);
}

