package org.example.librarymanagement.user;

import org.example.librarymanagement.Person;
import org.example.librarymanagement.enums.AccountStatus;

public abstract class User {
    private String id;
    String username;
    String password;
    AccountStatus accountStatus;
    Person person;

    public abstract boolean resetPassword();
}


