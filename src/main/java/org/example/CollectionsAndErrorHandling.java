package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CollectionsAndErrorHandling {
    public static void main(String[] args) {
        // Define a List of integers with at least one set of duplicates.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);

        try {
            //Use a Set to remove duplicates.
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            //Calculate the sum and average of the integers.
            int sum = 0;
            for (int number : uniqueNumbers) {
                sum += number;
            }

            // Handling potential ArithmeticException (e.g., division by zero)
            double average = 0;
            if (!uniqueNumbers.isEmpty()) {
                average = (double) sum / uniqueNumbers.size();
            }
            //Print the sum, average, and the list of integers without duplicates.
            System.out.println("Original List: " + numbers);
            System.out.println("Average List: " + average);
            System.out.println("Sum List: " + sum);
            System.out.println("List without duplicates: " + uniqueNumbers);


            // This will throw an exception


        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("An error occurred:" + e.getMessage());
        } catch (Exception e) {
            // Handling any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Process Completed");
        }

    }
}
