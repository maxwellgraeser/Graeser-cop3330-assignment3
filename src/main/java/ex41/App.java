/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        List<String> names = readInput();
        sort(names);
        outputFile(names);
    }
    // create a list of strings from the input file
    // sort the names
    // output to file

    // Reads the input of a pre-determined file exercise41_input.txt and returns it as a List of Strings
    static List<String> readInput() throws IOException {
        List<String> input;
        try (Stream<String> lines = Files.lines(Paths.get("src/main/java/ex41/exercise41_input.txt"))) {
            input = lines.collect(Collectors.toList());
        }
        return input;
    }
    // create a list of strings
    // read in each line as one item in list
    // return list

    // Sorts a given list of strings
    static void sort(List<String> names) {
        names.sort(String.CASE_INSENSITIVE_ORDER);
    }
    // names.sort( by case )

    // Outputs given list of strings into exercise41_output.txt in the correct format
    static void outputFile(List<String> names) throws IOException {
        FileWriter output = new FileWriter("src/main/java/ex41/exercise41_output.txt");

        output.write("Total of " + names.size() + " names\n------------------\n");
        output.flush();
        for (String name : names) {
            output.write(name + "\n");
            output.flush();
        }
        output.close();
    }
    // new file writer
    // write "total of (names size) names"
    // for (names) write name
}
