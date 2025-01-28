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



Explanation :
  
try Block: Contains the code that may throw an exception.
catch Block(s): Catches and handles specific exceptions.
finally Block (Optional): Executes after the try and catch blocks, regardless of whether an exception occurred.
  
Key Points :
  
You can have multiple catch blocks to handle different types of exceptions.
The finally block is often used to release resources like file handles or database connections.
Exceptions should be caught in the order from the most specific to the most general (e.g., IOException before Exception).
