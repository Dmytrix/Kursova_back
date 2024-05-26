package com.api.rest.controllers;

import com.api.rest.component.ContactMapper;
import com.api.rest.models.domain.Contact;
import com.api.rest.models.dto.ContactForRequest;
import com.api.rest.services.ContactHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class ContactController {

    private final ContactHardcodedService contactService;
    private final ContactMapper contactMapper;

    @Autowired
    public ContactController(ContactHardcodedService contactService, ContactMapper contactMapper) {
        this.contactService = contactService;
        this.contactMapper = contactMapper;
    }

    @GetMapping("/users/contacts")
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping ("/users/contacts/add")
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact) {
        contactService.createContact(contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PutMapping("/users/contacts/update/{phoneNumber}")
    public ResponseEntity<Contact> updateContact(@PathVariable String phoneNumber, @RequestBody Contact contact) {
        contactService.updateContact(phoneNumber, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @DeleteMapping("/users/{username}/contacts/{phoneNumber}")
    public ResponseEntity<Void> deleteContact(@PathVariable String username, @PathVariable String phoneNumber) {
        contactService.deleteContact(phoneNumber);
        return ResponseEntity.noContent().build();
    }
}
