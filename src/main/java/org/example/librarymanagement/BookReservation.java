package org.example.librarymanagement;

import lombok.Data;
import org.example.librarymanagement.enums.ReservationStatus;

public class BookReservation {
    private String itemId;
    private Data creationDate;
    private  ReservationStatus reservationStatus;
    private String memberId;

}
