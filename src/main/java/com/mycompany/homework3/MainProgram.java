package com.mycompany.homework3;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainProgram {

    interface File_Reader<T> {

        default void lionscunter(ArrayList<T> anims) {
            int i = 0;
            for (T anim : anims) {
                if (anim instanceof Lion) {
                    i++;
                }
            }
            System.out.println("the lions number is " + i);

        }

        public void Excute();
    }

    interface File_Saver {

        public void Excute(ArrayList<Animal> animals);
    }

    public static Animal[] create_array(ArrayList<Animal> an) {

        Animal[] ans = new Animal[an.size()];

        for (int i = 0; i < an.size(); i++) {
            ans[i] = an.get(i);
        }
        return ans;
    }

    //Function To Creaate New Animals
    public static Animal createAnimal() {

        Scanner s = new Scanner(System.in);
        int id;
        String name, color;
        double length;
        int choice;

        System.out.println("choose which animal to Add\n1)Lion.\n2)Parrot.\n3)enough.");
        choice = s.nextInt();
        if (choice == 3) {
            return null;
        }
        System.out.print("enter id: ");
        id = s.nextInt();
        System.out.print("enter name: ");
        name = s.next();
        System.out.print("enter color: ");
        color = s.next();
        System.out.print("enter length: ");
        length = s.nextDouble();
        switch (choice) {
            case 1:
                return new Lion(id, name, color, length);
            case 2:
                return new Parrot_bird(id, name, color, length);

            default:
                System.out.println("invalid input.");
                return null;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<String> animals_names = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<Animal>();

        while (true) {

            Animal n = createAnimal();
            if (n == null) {
                break;
            }

            animals.add(n);
        }
        Animal[] anims = create_array(animals);
        Animal.CountAnimals(anims);

        File_Saver Saver_lambda = (ArrayList<Animal> animals_array)
                -> {
            try {
                File create = new File("C:\\Users\\UPDATE\\Desktop\\save.txt");
                create.createNewFile();
                FileWriter file_to_save = new FileWriter("C:\\Users\\UPDATE\\Desktop\\save.txt");
                for (Animal anim : animals_array) {
                    file_to_save.write(anim.toString() + "\n");

                }
                file_to_save.close();
            } catch (IOException ex) {
                Logger.getLogger(MainProgram.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        Saver_lambda.Excute(animals);

        File_Reader<Animal> Reader_lambda = ()
                -> {
            try {
                String animal_name;

                FileReader read_file = new FileReader("C:\\Users\\UPDATE\\Desktop\\save.txt");
                Scanner file_scanner = new Scanner(read_file);
                while (file_scanner.hasNextLine()) {
                    String data = file_scanner.nextLine();
                    animal_name = data.split(" ")[3];
                    animals_names.add(animal_name);
                }
                file_scanner.close();
                read_file.close();
                System.out.println(animals_names);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainProgram.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainProgram.class.getName()).log(Level.SEVERE, null, ex);
            }

        };
        Reader_lambda.Excute();

        File_Reader<Animal> Counter_lambda = ()
                -> {
        };
        Reader_lambda.lionscunter(animals);

    }
}
