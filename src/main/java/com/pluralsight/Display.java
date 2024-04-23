package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Display {
    public static void display() throws FileNotFoundException {
        // create a FileInputStream object pointing to a specific file
        FileInputStream goldi = new FileInputStream("src/main/resources/goldilocks.txt");
        FileInputStream hansel = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
        FileInputStream mary = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        //While loop to keep running until user quits application
        while (running) {
            System.out.println("(1) Goldilocks");
            System.out.println("(2) Hansel and Gretel");
            System.out.println("(3) Mary had a little lamb");
            System.out.println("(0) Quit");
            System.out.print("Pick a poem: ");
            int choice = scanner.nextInt();
            //Switch case to print poem user chooses
            switch (choice) {
                case 0:
                    System.out.println("Goodbye.");
                    running = false;
                    break;
                case 1:
                    FileReader.readFile(goldi);
                    break;
                case 2:
                    FileReader.readFile(hansel);
                    break;
                case 3:
                    FileReader.readFile(mary);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
