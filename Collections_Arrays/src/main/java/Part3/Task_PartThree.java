package Part3;

import java.util.*;
import java.util.stream.Collectors;


public class Task_PartThree{

/*
Part: 3

1. Take List<String> of song from task 2

2. Remove all word ""yellow"" and ""submarine""

3. Print the result."    */

//This file must be used with UpdatedTASK_PartOne

    public static void main(String[] args) {

        String song = UpdatedTask_PartOne.song;
        String updatedSong = song.replaceAll("[,\\n]", "").toLowerCase();

        //List String of songs from Task 2
        List<String> wrds = new ArrayList<>(List.of(updatedSong.split(" ")));


        // Print initial words and their count
        wrds.forEach(System.out::println);
        System.out.println("Initial word count: " + wrds.size());

        // Remove duplicates and sort by length
        wrds = wrds.stream().distinct().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        System.out.println("Unique words");
        wrds.forEach(System.out::println);
        System.out.println("Unique word count: " + wrds.size());

        // Part 3: Remove all instances of "yellow" and "submarine"
         wrds.removeIf(word -> word.equals("yellow") || word.equals("submarine"));

        // Print the result
        System.out.println("\nUpdated unique words without 'yellow' and 'submarine':");
        wrds.forEach(word -> System.out.println(word + " "));

    }



}