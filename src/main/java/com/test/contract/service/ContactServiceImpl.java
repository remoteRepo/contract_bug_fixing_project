package com.test.contract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.contract.entity.Contact;
import com.test.contract.repository.ContactRepository;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    /**
     * Метод добавляет парочку записей в БД после запуска приложения,
     * чтобы не было совсем пусто.
     *
     * Из-за того, что подключена H2 (in-memory) БД.
     */
    @PostConstruct
    public void generateTestData() {
        save(new Contact("Иван Иванов", "+123456789", "ivan@test.email", "22"));
        save(new Contact("Петр Петров", "+987654321", "petr@test.email", "22"));
        save(new Contact("Имя Фвмилия", "number","mail","22"));
    }

    @Override
    public Contact save(Contact contact) {
        return repository.save(contact);
    }

    @Override
    public List<Contact> findAll() {
        return repository.findAll();
    }
}
