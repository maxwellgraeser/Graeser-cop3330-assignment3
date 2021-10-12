/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class websiteGenerator {
    String name;
    String author;
    String js;
    String css;
    String path = "src/main/java/ex43/";

    // Runs the website generator
    public String run() {
        String result = "";
        result += folder();
        result += html();
        if (js.equals("y") || js.equals("yes") || js.equals("Y") || js.equals("Yes"))
            result += jsFolder();
        if (css.equals("y") || css.equals("yes") || css.equals("Y") || css.equals("Yes"))
            result += cssFolder();
        return result;
    }
    // declare an empty string

    // Creates the folder
    public String folder() {
        String directory = path + name;
        new File(directory).mkdirs();
        return directory + "\nCreated ";
    }
    // String directory = desired path + name given
    // create new folder, then return output line for this folder

    // Creates the index.html file
    public String html() {
        String directory = path + name + "/index.html";
        String HTML = String.format("<title>%s</title><meta>%s</meta>", name, author);
        try {
            File f = new File(directory);
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(HTML);
            bw.close();
            return directory;
        } catch (IOException e) {
            return "Failed to create file";
        }
    }
    // String directory = desired path + name given + "/index.html"
    // write out html file as a String
    // create new html file, then return output line for this file

    // Creates the JavaScript folder
    public String jsFolder() {
        String directory = path + name + "/js/";
        new File(directory).mkdirs();
        return "\nCreated " + directory;
    }
    // String directory = desired path + name given + "/js/"
    // create new folder, then return output line for this folder

    // Creates the CSS folder
    public String cssFolder() {
        String directory = path + name + "/css/";
        new File(directory).mkdirs();
        return "\nCreated " + directory;
    }
    // String directory = desired path + name given + "/css/"
    // create new folder, then return output line for this folder
}
