package org.example.librarymanagement.user;

import lombok.Builder;
import lombok.Data;
import org.example.librarymanagement.BookItem;

import java.util.Date;

@Data
@Builder
public class Member extends User {

    private Date dateOfMemberShip;
    private int totalBooksCheckOut;

    public boolean reserveBookItem(BookItem bookItem) {
        return false;
    };

    public void incrementTotalBooksCheckout() {}

    public boolean checkOutBookItem(BookItem bookItem) {
        return false;
    }

    public void checkOutFine(BookItem item) {}

    public void returnBookItem(BookItem bookItem) {}

    public void renewBookItem(BookItem bookItem) {}

    @Override
    public boolean resetPassword() {
        return false;
    }
}
