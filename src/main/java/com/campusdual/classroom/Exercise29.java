package com.campusdual.classroom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró.");
        }
    }
}
