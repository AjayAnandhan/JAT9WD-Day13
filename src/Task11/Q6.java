package Task11;

public class Q6 {

	public static class IncorrectPasswordException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	}
	public static class LoginSystem {
	    private static final String VALID_PASSWORD = "password123";

	    public void login(String username, String password) throws IncorrectPasswordException {
	        if (!password.equals(VALID_PASSWORD)) {
	            throw new IncorrectPasswordException();
	        }

	        // Continue with the login process if the password is correct
	    }
	}
	    public static void main(String[] args) {
	        LoginSystem loginSystem = new LoginSystem();
	        String username = "john";
	        String password = "incorrectPassword";

	        try {
	            loginSystem.login(username, password);
	            System.out.println("Login successful!"); // Display a success message if login is successful
	        } catch (IncorrectPasswordException a) {
	            System.out.println("Incorrect password!"); // Display an error message if the password is incorrect
	        }
	    }
	
}
