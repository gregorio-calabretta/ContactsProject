package com.example.ContactsProject.service;

import com.example.ContactsProject.entity.Contact;
import com.example.ContactsProject.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> showContact()
    {
        return contactRepository.findAll();
    }

    public Contact saveContact(Contact contact)
    {
        return contactRepository.save(contact);
    }

}
