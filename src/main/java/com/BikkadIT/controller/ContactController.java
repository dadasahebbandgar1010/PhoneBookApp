package com.BikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.entities.Contact;
import com.BikkadIT.service.ContactServiceI;

@RestController
public class ContactController {
	@Autowired
	private ContactServiceI contactServiceI;

	@PostMapping(value = "/saveContact", consumes = "application/json")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact) {

		boolean saveContact = contactServiceI.saveContact(contact);

		if (saveContact) {
			String msg = "Contact Saved Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Contact not Saved Successfully", HttpStatus.CREATED);

		}
	}
}
