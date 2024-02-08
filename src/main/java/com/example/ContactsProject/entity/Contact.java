package com.example.ContactsProject.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Contacts")
@Getter

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String birthday;

    public Contact(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Contact() {

    }
}
