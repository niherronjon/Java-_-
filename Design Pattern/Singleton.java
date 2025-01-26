//A Singleton is a design pattern that ensures a class has only one instance and provides a global access point to it.

// Singleton Class
public class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to restrict instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null)
        {
            // Create the instance if it does not exist
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Main Class
public class Main {
    public static void main(String[] args)
    {
        // Attempt to get Singleton instances
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Verify both references point to the same instance
        System.out.println(singleton1 == singleton2); // Output: true

        // Call method from the singleton instance
        singleton1.showMessage();
    }
}


//Explanation:

/*
Private Constructor: Ensures no other class can instantiate it.
Static Instance Variable: Holds the single instance.
Lazy Initialization: Instance is created only when getInstance() is called for the first time.
Thread Safety: For multi-threaded environments, you can use synchronization or an eager initialization approach.
*/
  
