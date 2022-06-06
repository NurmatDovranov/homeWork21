package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fileWriter();
        fileReader();

    }

    public static void fileWriter() {
        try (FileWriter fileWriter = new FileWriter("ABC")) {
            char i;
            for (i = 'A'; i <= 'Z'; i++) {
                fileWriter.write((i+ "" + Character.toLowerCase(i) + ", "+"\n"));
            }
            for(int j = 0; j <= 9; j++){
                fileWriter.write(j + ", "+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void fileReader () {
            try (FileReader fileReader = new FileReader("ABC")) {

                Scanner scanner = new Scanner(fileReader);

                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

