package com.example.ContactsProject.controller;

import com.example.ContactsProject.entity.Contact;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @GetMapping("/Contacts")
    public List<Contact> showContacts(){
        ResponseEntity<>
    }

}
