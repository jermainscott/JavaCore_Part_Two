package Part2;

import java.util.*;

public class Task_PartTwo {
/*Part: 2

1. Update Task #1 to use collections to count the words.  (Put song from array to List)

2. Remove all duplicate words from the song and print to console

3. Sort song words by String length. "  */

    public static void main(String[] args) {
        String song = UpdatedTask_PartOne.song;
        String updatedSong = song.replaceAll("[,\\n]", "").toLowerCase();

        //List String of songs from Task 2
        List<String> wrds = new ArrayList<>(List.of(updatedSong.split(" ")));


        // Print initial words and their count
        wrds.forEach(System.out::println);
        System.out.println("Initial word count: " + wrds.size());

        // Remove duplicates and sort by length
        wrds = wrds.stream().distinct().sorted(Comparator.comparing(String::length)).toList();

        System.out.println("Unique words");
        wrds.forEach(System.out::println);
        System.out.println("Unique word count: " + wrds.size());
        //prints the amount of words after duplicate words are removed
    }






}