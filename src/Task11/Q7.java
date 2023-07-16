package Task11;

public class Q7 {

	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class Main {

	    public void validateAge(int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Invalid age: Age must be 18 or above.");
	        }
	    }

	    public void main(String[] args) {
	        try {
	            int age = 15; 


	            validateAge(age);

	            System.out.println("Age is valid. Continue with the program.");

	        } catch (InvalidAgeException a) {

	            System.out.println("Error: " + a.getMessage());
	        }
	    }
	}


}
