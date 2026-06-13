import java.util.Scanner; // Imports the Scanner class to read user input

class Main {

    // The main method is the starting point of any Java application
    public static void main(String[] args) {
        
        // 1. Declare and initialize variables
        String greeting = "Welcome to Java programming!";
        System.out.println(greeting);
        
        // 2. Set up a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        
        // Read string input from the user
        String userName = inputScanner.nextLine();
        
        System.out.print("Enter your birth year: ");
        // Read integer input from the user
        int birthYear = inputScanner.nextInt();
        // Close the scanner to prevent resource leaks
        // Close the scanner to prevent resource leaks
        // 3. Calculate age and use conditional logic
        int currentYear = 2026;
        int age = currentYear - birthYear;
        // 3. Calculate age and use conditional logic
        // Close the scanner to prevent resource leaks
        // Close the scanner to prevent resource leaks

        
        System.out.println("\nHello, " + userName + "!");
        System.out.println("You are approximately " + age + " years old.");
        
        // Check age condition
        if (age >= 18) {
            System.out.println("Status: You are an adult.");
        } else {
            System.out.println("Status: You are a minor.");
        }
        
        // 4. Call a custom method
        System.out.println("\nLet's count to 3:");
        countToThree();
        
        // Close the scanner to prevent resource leaks
        // Close the scanner to prevent resource leaks
        inputScanner.close();
    }

    // A simple helper method that uses a loop
    public static void countToThree() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Number: " + i);
        }
    }
}
