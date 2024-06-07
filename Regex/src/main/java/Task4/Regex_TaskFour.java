package Task4;
/*
4. find and return how many orders were created from this string

app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO
LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]

 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_TaskFour {

    public static int findNumberOfOrders(String input) {
        // Defining the regex pattern to match the number of orders
        String orderPattern = "total number of orders successfully processed: \\[(\\d+)\\]";

        // Compile the pattern
        Pattern pattern = Pattern.compile(orderPattern);

        // Creating a matcher to find matches in the input string
        Matcher matcher = pattern.matcher(input);

        // Check if a match is found
        if (matcher.find()) {
            // Return the matched group which contains the number of orders
            return Integer.parseInt(matcher.group(1));
        } else {
            // Return 0 if no match is found
            return 0;
        }
    }

    public static void main(String[] args) {
        String inputToTest = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 " +
                "poiFileName=Integration_test_Contract INFO  LogUtils - POI " +
                "file name: [Integration_test_Contract], " +
                "total number of orders successfully processed: [2]";

        // Find and return the number of orders
        int numberOfOrders = findNumberOfOrders(inputToTest);
        System.out.println("Number of orders created: " + numberOfOrders); // Output: Number of orders created: 2
    }
}
