package com.esprit.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Contact;
import com.esprit.project.repository.ContactRepository;

import java.util.List;
@Service
public class ContactServiceImplementation implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact addcontact(Contact c) {
        return contactRepository.save(c);
    }

    @Override
    public List<Contact> listContact() {
        return contactRepository.findAll();
    }

    @Override
    public void deleteContact(Contact c) {
        contactRepository.delete(c);
    }
}
