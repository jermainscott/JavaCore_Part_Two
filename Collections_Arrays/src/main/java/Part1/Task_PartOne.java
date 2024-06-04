package Part1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* Part: 1

1. Find in Google song ""beatles yellow submarine""

2. Save this song as String

3. Remove all "","" , ""\n "" and convert all words to lowercase (Programmatically!)

4. Make an array[] (not a List) from the string (array of words)

5. Print to console word and how many times it appeared in the array"

*/


public class Task_PartOne {
    public static void main(String[] args) {


        // beatles yellow submarine song lyrics
        String song = "In the town where I was born\n" +
                "Lived a man who sailed to sea\n" +
                "And he told us of his life\n" +
                "In the land of submarines\n" +
                "So we sailed on to the sun\n" +
                "'Til we found a sea of green\n" +
                "And we lived beneath the waves\n" +
                "In our yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "And our friends are all aboard\n" +
                "Many more of them live next door\n" +
                "And the band begins to play\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "Full steam ahead, Mister Boatswain, full steam ahead\n" +
                "Full steam ahead it is, Sergeant\n" +
                "(Cut the cable, drop the cable)\n" +
                "Aye-aye, sir, aye-aye\n" +
                "Captain, captain\n" +
                "As we live a life of ease (a life of ease)\n" +
                "Every one of us (every one of us)\n" +
                "Has all we need (has all we need)\n" +
                "Sky of blue (sky of blue)\n" +
                "And sea of green (sea of green)\n" +
                "In our yellow (in our yellow)\n" +
                "Submarine (submarine, aha)\n" +
                "We all live in a yellow submarine\n" +
                "A yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "A yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine";


        //System.out.println(song.replaceAll("[,\\n]", "").toLowerCase());
        //System.out.println(songUpdate);


        //Remove all "","" , ""\n "" and convert all words to lowercase (Programmatically!)
        String updatedSong = song.replaceAll("[,\\n]", "").toLowerCase();



        String[] arrayOfWords = updatedSong.split(" ");

        //Make an array[] (not a List) from the string (array of words)
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : arrayOfWords) {
            if (word.isEmpty()) {
                continue; // skip empty strings resulting from multiple spaces
            }

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        }
// Print each word and how many times it appeared in the array
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}

