package com.epicode.U5D1.entities;

import lombok.Data;

@Data
public class Table {
    int tableNumber;
    int maxNumberOfGuests;
    boolean isOccupied;

    public Table(int tableNumber, int maxGuests, boolean isOccupied) {
        this.tableNumber = tableNumber;
        this.maxNumberOfGuests = maxGuests;
        this.isOccupied = false;
    }
}
