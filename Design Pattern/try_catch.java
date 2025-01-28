What is try-catch ?
  
try: Put the code that might cause an error inside this block.
catch: If an error happens, this block will handle it.
  
Simple Example : 

  public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that might cause an error
            int number = 10 / 0; // This will cause an error (divide by zero)
            System.out.println("Number: " + number);
        } catch (ArithmeticException e) {
            // Handle the error
            System.out.println("You cannot divide a number by zero.");
        }
    }
}
