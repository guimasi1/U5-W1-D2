package com.epicode.U5D1.entities;

import lombok.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor
@PropertySource("application.properties")
@Component
public class Order {

    List<Item> items;
    int orderNumber;
    OrderStatus orderStatus;
    Table table;
    int numberOfGuests;
    LocalDateTime orderPlacementTime;
    @Value("${coverFee.price}")
    double coverFee;
    double totalCost;

    public Order(List<Item> items, int orderNumber, OrderStatus orderStatus, Table table, int numberOfGuests, LocalDateTime orderPlacementTime, double totalCost) {
        this.items = items;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
        this.table = table;
        this.numberOfGuests = numberOfGuests;
        this.orderPlacementTime = orderPlacementTime;
        this.totalCost = (numberOfGuests * coverFee) + items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }
}
