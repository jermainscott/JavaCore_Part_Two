package Part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Task_Part_Four {

    // Save beatles yellow submarine song to a text file
    private static void saveSongToFile() {
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

        try (FileWriter fileWriter = new FileWriter("BeatlesYellowSubmarine.txt")) {
            fileWriter.write(song);
            System.out.println("Song saved to BeatlesYellowSubmarine.txt");
        } catch (IOException e) {
            System.err.println("Error writing song to file: " + e.getMessage());
        }

    }

    //Reads song from the file using serialization (try-with-resources)
    private static String readSongFromFile() {
        StringBuilder song = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("BeatlesYellowSubmarine.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                song.append(line).append("\n");
            }
            System.out.println("Song read from BeatlesYellowSubmarine.txt");
        } catch (IOException e) {
            System.err.println("Error reading song from file: " + e.getMessage());
        }
        return song.toString();
    }

    //Define a custom exception BeatlesException extending Exception
    public static class BeatlesException extends Exception {
        public BeatlesException(String message) {
            super("Beatles " + message);
        }
    }

    //Creating a method which verifies if some random string can be found in the song
    private static void verifyStringInSong(String song, String searchString) throws BeatlesException {
        if (!song.contains(searchString)) {
            throw new BeatlesException("Exception: \"" + searchString + "\" not found in the song.");
        }
    }


    public static void main(String[] args) {
        //Calling the save song to file method
        saveSongToFile();

        //Calling the read song from file method
        String song = readSongFromFile();

        //Verifying if a random string can be found in the song
        String searchString = "Show must go on!";
        try {
            verifyStringInSong(song, searchString);
            System.out.println("The string \"" + searchString + "\" was found in the song.");
        } catch (BeatlesException e) {
            System.err.println(e.getMessage());
        }
    }

}
