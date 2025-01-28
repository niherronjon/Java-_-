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


What Happens Here:

Inside the try block, 10 / 0 causes an error (division by zero).
The catch block catches the error and prints: "You cannot divide a number by zero."
The program doesn’t crash; it handles the error gracefully.
  
Why Use try-catch?
  
It stops the program from crashing when something unexpected happens.
You can handle errors in a way that makes sense for your program.
