package Task3;
/*
3. Find and return user email from string

test 2667843 (test_email@griddynamics.com) test 67483 some string

*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_TaskThree {

    public static String findEmail(String input) {

        // Defining  the regex pattern to match the email
        String emailPattern = "[a-zA-Z0-9_]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailPattern);

        // Creating  a matcher to find matches in the input string
        Matcher matcher = pattern.matcher(input);

        // Check if a match is found
        if (matcher.find()) {
            // Return the matched group which contains the email
            return matcher.group();
        } else {
            // Return null if no match is found
            return null;
        }
    }

    public static void main(String[] args) {
        String inputToTest = "test 2667843 (test_email@griddynamics.com) test 67483 some string";

        // Find and return the email
        String email = findEmail(inputToTest);
        System.out.println("Email returned: " + email); // Output: Email returned: test_email@griddynamics.com
    }
}
