package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        try {
            Display.display();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
