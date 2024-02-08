package com.example.ContactsProject.controller;

import com.example.ContactsProject.entity.Contact;
import com.example.ContactsProject.repository.ContactRepository;
import com.example.ContactsProject.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ContactService contactService;
    @GetMapping("/Contacts")
    public List<Contact> getContacts(){
        return contactService.showContact();
    }

    @PostMapping("/Contact")
    public Contact postContact(@RequestBody Contact contact){
    return contactService.saveContact(contact);
    }

}
