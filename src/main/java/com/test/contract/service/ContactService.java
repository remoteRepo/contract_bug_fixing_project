package com.test.contract.service;

import com.test.contract.entity.Contact;

import java.util.List;


public interface ContactService {

    Contact save(Contact contact);

    List<Contact> findAll();

}
