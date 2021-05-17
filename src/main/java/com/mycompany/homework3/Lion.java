package com.mycompany.homework3;

import java.io.*;
import java.util.*;
//lion must extend animal and implement the coparable to compare between two objects of lion type.
//animal is abstract,we shoulf to implement the abstract methods here like "eat".

public class Lion extends Animal implements Comparable<Object> {

    public Lion(int animal_id, String name, String Color, double Length) {
        super(animal_id, name, Color, Length);
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }

    public String toString() {
        return super.toString();
    }

    //eat is abstract method 
    @Override
    public void eat() {
        System.out.println("i'm eating meat right now.");
    }

    //here we compare betwwen two lions
    @Override
    public int compareTo(Object o) {
        if (o instanceof Lion) {
            Lion l = ((Lion) o);
            if ((this.name == l.name) && (this.Color == l.Color) && (this.Length == l.Length)) {
                return 0;
            }
        }
        return -1;
    }

}
