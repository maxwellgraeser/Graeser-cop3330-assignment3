/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex43;

import java.util.Scanner;

public class App {
    private static final Scanner scan = new Scanner(System.in);
    private static String name;
    private static String author;
    private static String js;
    private static String css;

    public static void main(String[] args) {
        websiteGenerator web = new websiteGenerator();
        getInput();

        // Transfer inputs to websiteGenerator
        web.name = name;
        web.author = author;
        web.js = js;
        web.css = css;

        String output = "Created ";
        output += web.run();
        out(output);
    }
    // Create a new websiteGenerator object
    // get the input from user
    // set object values equal to input
    // run website generator
    // print output

    // Gets user input
    static void getInput() {
        System.out.print("Site name: ");
        name = scan.nextLine();
        System.out.print("Author: ");
        author = scan.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = scan.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        css = scan.nextLine();
    }
    // Print questions, set results to corresponding strings

    // Prints the output String
    static void out(String output) {
        System.out.println(output);
    }
    // print the output string
}
