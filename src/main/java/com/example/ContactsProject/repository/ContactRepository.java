package com.example.ContactsProject.repository;

import com.example.ContactsProject.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository

public interface Repo extends JpaRepository<Contact, Long> {
    List<Contact> findAll();
}
