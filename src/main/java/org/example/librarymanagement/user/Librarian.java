package org.example.librarymanagement.user;

import org.example.librarymanagement.BookItem;


public class Librarian extends User {

    public boolean addBookItem(BookItem bookItem) {
        return false;
    }
    public boolean blockMember(Member member) {
        return false;
    }

    public  boolean unBlockMember(Member member) {
        return false;
    }
    @Override
    public boolean resetPassword() {
        return false;
    }
}
