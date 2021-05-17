
package com.mycompany.homework3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public abstract class Animal {

    int animal_id;
    String name;
    String Color;
    double Length;

    public Animal(int animal_id, String name, String Color, double Length) {
        this.animal_id = animal_id;
        this.name = name;
        this.Color = Color;
        this.Length = Length;
    }

    @Override
    public String toString() {
        return "animal_id= " + animal_id + " name= " + name + " Color= " + Color + " Length= " + Length;
    }

   

    public abstract void eat();

//count all lions and parrot birds
    static void CountAnimals(Animal animals[]) {
        int counter_lions = 0;
        int counter_birds = 0;
        for (Animal m : animals) {
            if (m instanceof Lion) {
                counter_lions++;
            }

            if (m instanceof Parrot_bird) {
                counter_birds++;
            }
        }
        System.out.println("the number of lions is: " + counter_lions);
        System.out.println("the number of parrot birds is: " + counter_birds);
    }
}
