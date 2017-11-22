package com.antonenko.nikita.labs;

import com.google.gson.*;

import java.io.*;
import java.util.logging.*;

public class Main {

    private static final String NAMEOFFILE = "d:\\laba6.json";

    public static void main(String[] args) {

        // create matrix =======
        Matrix laba6 = new Matrix("Nikita", 20, Person.Sex.MALE);
        laba6.initRandom(1000, 10);

        // create gson =======
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String toFileJson = gson.toJson(laba6);

        // in file =======
        try (FileWriter fileWriter = new FileWriter(NAMEOFFILE)) {
            fileWriter.write(toFileJson);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        // read string file and read from gson =======
        Matrix restoredMatrix = null;
        try {
            // read from file
            BufferedReader reader = new BufferedReader(new FileReader(NAMEOFFILE));
            //read from json
            restoredMatrix = gson.fromJson(reader, Matrix.class);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        // Check
        if (laba6.equals(restoredMatrix)){
            System.out.println("\nHurrah!!! \nVariables are equal!!!");
        } else System.out.println("\nOops something went wrong! :/");
    }
}
