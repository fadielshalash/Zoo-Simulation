package com.mycompany.homework3;

import java.io.*;
import java.util.*;
//this class extend animal class and implemet the comparable to compare betwwen two object of parrot bird type.
//animal is abstract,we shoulf to implement the abstract methods here like "eat".

public class Parrot_bird extends Animal implements Comparable<Object> {

    public Parrot_bird(int animal_id, String name, String Color, double Length) {
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

    //override this from animal.eat is abstract method
    @Override
    public void eat() {
        System.out.println("i'm eating cereals right now.");
    }

    @Override
    public int compareTo(Object pa) {
        if (pa instanceof Parrot_bird) {
            Parrot_bird p = ((Parrot_bird) pa);

            if ((this.name == p.name) && (this.Color == p.Color) && (this.Length == p.Length)) {
                return 0;
            }
        }
        return -1;
    }

}
