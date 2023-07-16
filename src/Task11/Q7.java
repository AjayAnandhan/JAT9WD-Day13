package Task11;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        try {
            int age = 16; // User input, for example purposes
            AgeValidator.validateAge(age);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
