/*In Java, the try-catch block is used to handle exceptions, providing a way to deal with runtime errors so that the program can continue 
  executing instead of crashing. Here's the syntax and an example of how it works:*/

//Syntex :

try {
    // Code that might throw an exception
} catch (ExceptionType1 e1) {
    // Code to handle exception of type ExceptionType1
} catch (ExceptionType2 e2) {
    // Code to handle exception of type ExceptionType2
} finally {
    // Optional: Code that will always execute, whether or not an exception was thrown
}


Example :

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block always executes
            System.out.println("Execution complete.");
        }
    }
}
