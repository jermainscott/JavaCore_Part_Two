package Task2;

/*
 2. Find and return orderUUID substring from string
app=edi_adapter_converter wingtipsTrace=8faeae6709355291
INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract
customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_TaskTwo {

    public static String findOrderUUID(String input) {

        // Defining the regex pattern to match the orderUUID
        String uuidPattern = "orderUUID=([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})";

        // This is compiling the pattern
        Pattern pattern = Pattern.compile(uuidPattern);

        // Creating a matcher to find matches in the input string
        Matcher matcher = pattern.matcher(input);

        // Check if a match is found
        if (matcher.find()) {
            // Return the matched group which contains the UUID
            return matcher.group(1);
        } else {
            // Return null if no match is found
            return null;
        }
    }

    public static void main(String[] args) {
        String regexElement= "app=edi_adapter_converter wingtipsTrace=8faeae6709355291" +
                " INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract " +
                "customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515" +
                " lineCount=3";

        // Find and return the orderUUID
        String orderUUID = findOrderUUID(regexElement);
        System.out.println("Order UUID: " + orderUUID); //This will Output: Order UUID: d34149d8-88ab-4791-bb0a-46c96e034200
    }
}
