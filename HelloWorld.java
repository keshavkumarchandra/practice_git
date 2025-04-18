// Import necessary Java libraries
import java.util.Scanner; 

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input
        
        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to Java in VS Code.");
        
        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}

