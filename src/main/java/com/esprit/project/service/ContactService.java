package com.esprit.project.service;


import java.util.List;

import com.esprit.project.entity.Contact;

public interface ContactService {
    public Contact addcontact(Contact c);
    public List<Contact> listContact();
    public void deleteContact (Contact c);
}
