import java.util.ArrayList;
import java.util.List;

public class SumOfIntegers {

    // Method to parse strings into Integer objects using autoboxing
    public static List<Integer> parseStringToIntegers(String[] numbers) {
        List<Integer> integerList = new ArrayList<>();
        for (String num : numbers) {
            // Autoboxing: Convert int to Integer
            integerList.add(Integer.parseInt(num));
        }
        return integerList;
    }

    // Method to calculate the sum of a list of Integers using unboxing
    public static int calculateSum(List<Integer> integerList) {
        int sum = 0;
        for (Integer num : integerList) {
            // Unboxing: Convert Integer to int
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Input strings representing numbers
        String[] numbers = {"10", "20", "30", "40", "50"};
        
        // Parse strings to Integer objects
        List<Integer> integerList = parseStringToIntegers(numbers);
        
        // Calculate sum using unboxing
        int sum = calculateSum(integerList);
        
        // Display the sum
        System.out.println("Sum of integers: " + sum);
    }
}
