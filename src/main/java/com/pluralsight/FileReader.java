package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileReader {
    //Method to read text files
    public static void readFile(FileInputStream poem) {
        // create a Scanner to reference the file to be read
        Scanner scanner = new Scanner(poem);
        int i = 1;
        String input;
        // read until there is no more data
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            System.out.println(i++ + ". " + input);
        }
        // close the scanner and release the resources
        scanner.close();
    }
}
