/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex42;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws IOException {
        String data = readInput();
        printOutput(data);
    }
    // String data = read input
    // printOutput

    // Reads the input of a pre-determined file exercise42_input.txt and returns it as one string
    static String readInput() throws IOException {
        return (Files.readString(Path.of("src/main/java/ex42/exercise42_input.txt")));
    }
    // return string value of input text

    // Prints the output to the terminal
    static void printOutput(String output) {
        String[] converted = output.split("[,\\r\\n]+");

        System.out.println("Last      First     Salary\n--------------------------");
        for (int i = 0; i < converted.length; i += 3) {
            System.out.printf("%-10s", converted[i]);
            System.out.printf("%-10s", converted[i + 1]);
            System.out.printf("%-10s", converted[i + 2]);
            System.out.print("\n");
        }
    }
    // split String based on commas
    // for (length of input) output their lastname, firstname, and salary formatted correctly
}
