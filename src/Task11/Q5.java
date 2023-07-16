package Task11;

public class Q5 {
	    public static void main(String[] args) {
	        try {
	            // ArrayIndexOutOfBoundsException example
	            int[] numbers = { 1, 2, 3 };
	            int value = numbers[3]; 
	            System.out.println("Value: " + value); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds.");
	        }
	        
	        try {
	            // StringIndexOutOfBoundsException example
	            String str = "Hello, World!";
	            char ch = str.charAt(15);
	            System.out.println("Character: " + ch);
	        } catch (StringIndexOutOfBoundsException a) {
	            System.out.println("Error: String index out of bounds.");
	        }
	    
	}

}
