package com.api.rest.repositories;


import com.api.rest.models.domain.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
    void deleteByPhoneNumber(String phoneNumber);
    Contact findContactByPhoneNumber(String phoneNumber);
}
