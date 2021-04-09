package com.software.nick.medicinestore.store.module.account.repository;

import com.software.nick.medicinestore.store.module.account.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test()
    void saveEmptyAccount(){
        accountRepository.save(account);
    }

    @Test
    void findByUsername() {
    }

    @Test
    void findByEmail() {
    }
}