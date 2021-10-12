/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex45;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the name of the new file? ");
        String filename = scan.nextLine();
        String input = readInput();
        String output = replaceWords(input);
        outputFile(filename, output);
    }
    // ask for new file name
    // read input, replace words, output to file

    // Replaces all the words "utilize" in exercise45_input.txt with "use"
    static String replaceWords(String inputText) throws IOException {
        return inputText.replaceAll("(utilize)+", "use");
    }
    // Replace all instances of "utilize" with "use" and return new string

    // Reads input from predetermined file exercise45_input.txt
    static String readInput() throws IOException {
        return (Files.readString(Path.of("src/main/java/ex45/exercise45_input.txt")));
    }
    // read input from file and return as a string

    // Given the filename and a String text, it outputs a new txt file called "filename.txt" in "src/main/java/ex45/"
    static void outputFile(String filename, String text) throws IOException {
        String directory = "src/main/java/ex45/" + filename;
        FileWriter output = new FileWriter(directory);
        output.write(text);
        output.close();
    }
    // create new file of given filename
    // write the given text
    // close file writer
}
