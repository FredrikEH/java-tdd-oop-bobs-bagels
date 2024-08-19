package com.booleanuk.core;

import java.util.HashMap;
import java.util.UUID;

public class Order {

    public HashMap<String, Integer> basket = new HashMap<>();
    private UUID id;
    int price;

    public Order(){
        this.id = UUID.randomUUID();
        this.price = 0;
    }

    public void addProduct(String newProduct){
    }

    public UUID getId(){
        return this.id;
    }

    public void setId(UUID newId){
        this.id = newId;
    }

    public int getPrice(){
        return this.price;
    }
}
