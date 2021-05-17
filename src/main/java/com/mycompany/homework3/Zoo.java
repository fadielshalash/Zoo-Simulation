package com.mycompany.homework3;

import java.io.*;
import java.util.*;

public class Zoo {

    //UUID is for the unique attribute
    UUID Zoo_id;
    String name;
    String address;
    ArrayList<Animal> animals = new ArrayList<>();//this arraylist type is animal

    public Zoo(UUID Zoo_id, String name, String address) {
        this.Zoo_id = Zoo_id;
        this.name = name;
        this.address = address;
    }

    public UUID getZoo_id() {
        return Zoo_id;
    }

    public void setZoo_id(UUID Zoo_id) {
        this.Zoo_id = Zoo_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" + "Zoo_id=" + Zoo_id + ", name=" + name + ", address=" + address + ", animals=" + animals + '}';
    }

}
