package Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_TaskOne {

    public static boolean containsOrderUUID(String input) {

        // Defining the regex pattern to match the UUID format
        String uuidPattern = "orderUUID=[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(uuidPattern);

        // Creating a matcher to find matches in the input string
        Matcher matcher = pattern.matcher(input);

        // Return true if a match is found, false otherwise
        return matcher.find();
    }

    public static void main(String[] args) {
        String regexElement = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 " +
                "INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract " +
                "customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 " +
                "lineCount=3";

        // Check if the string contains an orderUUID
        boolean hasOrderUUID = containsOrderUUID(regexElement);
        System.out.println("Contains orderUUID: " + hasOrderUUID); // Output: Contains orderUUID: true
    }
}
