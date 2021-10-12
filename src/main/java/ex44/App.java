/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ex44;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
    public static void main(String[] args) throws IOException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        String input = getInput();
        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("src/main/java/ex44/exercise44_input.json"));
            JSONArray products =  (JSONArray)jsonObject.get("products");

            while (!productCheck(input, products)) {
                System.out.print("Sorry, that product was not found in our inventory.");
                input = getInput();
            }

            printOutput(input, products);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    // take in input from JSON file and convert to JSON array
    // take in input for product to search for
    // while (product not in inventory)
    //      print that item isn't in inventory and take new input for item to check
    // the above while loop continues on when an item is found
    // print output of found item

        // Gets user input for product name
    static String getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the product name? ");
        String in = scan.nextLine();
        return in;
    }
    // New scanner object, ask for product name
    // get input and return it as a string

    static boolean productCheck(String target, JSONArray jArray) {
        Iterator iterator = jArray.iterator();
        while (iterator.hasNext()) {
            JSONObject json = (JSONObject) iterator.next();
            String name = (String)json.get("name");
            if(target.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    // Iterator of given JSONArray
    // while (iterator has available next value)
    //      if (product in array) return true
    // return false

    static void printOutput(String target, JSONArray jArray) {
        Iterator iterator = jArray.iterator();
        while (iterator.hasNext()) {
            JSONObject json = (JSONObject) iterator.next();
            String name = (String)json.get("name");
            if(target.equalsIgnoreCase(name)) {
                System.out.printf("Name: %s\nPrice: %.2f\nQuantity: %d", name, json.get("price"), json.get("quantity"));
            }
        }
    }
    //Iterator of given JSONArray
    // while (iterator has available next value)
    //      if (product in array) print output
    // this will always have a product in the array, because it won't move on to
    // this method in main unless it finds a matching product

}
