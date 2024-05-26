package com.api.rest.services;

import com.api.rest.models.domain.Contact;
import com.api.rest.repositories.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactHardcodedService {

    private final ContactRepository contactRepository;

    public ContactHardcodedService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public void deleteContact(String phoneNumber) {
        contactRepository.deleteByPhoneNumber(phoneNumber);
    }

    public void createContact(Contact contact) {
        contactRepository.save(contact);
    }

    public void updateContact(String phoneNumber, Contact contact) {
        contact.setId(contactRepository.findContactByPhoneNumber(phoneNumber).getId());
        contactRepository.save(contact);
    }
}
