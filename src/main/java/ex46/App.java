package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        String input = readInput();
        Map<String, String> frequency = getFreq(input);
        printOutput(frequency);
    }
    // read input
    // create a hashmap of the frequency of each word
    // print output

    // Reads input from predetermined file exercise46_input.txt
    static String readInput() throws IOException {
        return (Files.readString(Path.of("src/main/java/ex46/exercise46_input.txt")));
    }
    // read input from input file and return as a string

    // Given a String, splits the string into an array by word, returns a hashmap where each word is the key, and
    // the number of times that word appears as *'s for the value
    static Map<String, String> getFreq(String text) {
        String[] words = text.split("[ \\r\\n]+");
        Map<String, String> freqMap = new HashMap<>();
        for (String word : words) {
            String temp = freqMap.get(word);

            // no occurrence of word
            if (temp == null)
                freqMap.put(word, "*");
            // occurrence of words: add a "*"
            else
                freqMap.put(word, temp + "*");
        }
        return freqMap;
    }
    // create array of strings split by spaces or new lines
    // create new hashmap of type <String, String>
    // for (all words)
    //      if (no occurrence of that word) add word to map with one *
    //      else add a * to indicate # of times that word appears
    // return map

    // Given a map, it prints out the most frequent words first
    static void printOutput(Map<String, String> output) {
        int len = output.size();
        for (int j = 0; j < len; j++) {
            int longest = 0;
            String longestWord = "";

            // finds the most frequent word in the list
            for (Map.Entry<String, String> entry : output.entrySet()) {
                if (longest < entry.getValue().length()) {
                    longestWord = entry.getKey();
                    longest = entry.getValue().length();
                }
            }

            System.out.printf("\n%-10s %s", longestWord, output.get(longestWord));
            output.remove(longestWord);
        }
    }
    //for (0 to # of different words)
    //  for (every entry in map) iterate until you find the most frequent word with dummy variables as tests
    //  output the longest word
    //  remove word from map
}
