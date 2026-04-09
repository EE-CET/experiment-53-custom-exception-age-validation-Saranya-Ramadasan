import java.util.Scanner;

// Custom exception class extending the built-in Exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        // Pass the error message to the parent Exception class
        super(message);
    }
}

public class CustomException {
    
    // Method to validate age; must declare that it 'throws' the custom exception
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            
            try {
                // Call the validation method
                validate(age);
            } catch (InvalidAgeException e) {
                // Catch the specific custom exception and print the required message
                System.out.println("Exception: " + e.getMessage());
            }
        }
        
        sc.close();
    }
}