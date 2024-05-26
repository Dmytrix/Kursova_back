package com.api.rest.models.dto;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

public class ContactForRequest {
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private LocalDate dateOfBirthday;
    @Field
    @Indexed(unique = true)
    private String phoneNumber;
    @Field
    private String homeAddress;
    @Field
    private String placeOfWork;
    @Field
    private String email;

    public ContactForRequest() {
    }

    public ContactForRequest(String firstName, String lastName, LocalDate dateOfBirthday, String phoneNumber, String homeAddress, String placeOfWork, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirthday = dateOfBirthday;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.placeOfWork = placeOfWork;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
