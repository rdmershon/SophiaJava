// Import the Scanner class from the java.util package.
// This allows the program to read input typed by the user on their keyboard.
import java.util.Scanner;

public class SecurityTriageAutomator {

    // The 'main' method is the starting point of any Java application.
    // When the program runs, it executes the code inside this block first.
    public static void main(String[] args) {

        // Create a new Scanner object named 'inputReader'.
        // We will use this tool to capture what the security analyst types.
        Scanner inputReader = new Scanner(System.in);

        // --- STEP 1: GATHERING DATA ---
        
        // Print a welcome message and prompt the user for the first piece of information.
        System.out.println("--- M365 Defender Alert Triage System ---");
        System.out.println("Enter the Event Type (e.g., Unfamiliar sign-in, Routine Sync):");
        // Read the line of text the user types and store it in a variable called 'eventType'
        String eventType = inputReader.nextLine();

        // Prompt the user for the Application ID.
        System.out.println("Enter the Application ID:");
        // Store the typed text in a variable called 'appId'
        String appId = inputReader.nextLine();

        // Prompt the user for the alert severity.
        System.out.println("Enter the Severity (Low, Medium, High):");
        // Store the typed text in a variable called 'severity'
        String severity = inputReader.nextLine();

        System.out.println("\n--- Analyzing Alert Data ---");

        // --- STEP 2: EVALUATING LOGIC ---
        
        // We use an 'if/else' statement to make decisions based on the data.
        // We use '.equalsIgnoreCase' so the program doesn't break if the user types "low" instead of "Low".

        // Condition A: Check if this is a high-risk event type.
        if (eventType.equalsIgnoreCase("Unfamiliar sign-in")) {
            // If true, execute this block of code and skip the rest.
            System.out.println("Action: Manual Review required.");
            System.out.println("Reason: Potential compromised credentials detected.");
        } 
        
        // Condition B: Check if this matches our exact parameters for safe automation.
        // The '&&' means BOTH conditions must be true: Severity must be Low AND App ID must be App_774.
        else if (severity.equalsIgnoreCase("Low") && appId.equalsIgnoreCase("App_774")) {
            // If true, execute this block. This automates the closing of low-level, known events.
            System.out.println("Action: Auto-Close in Security Center.");
            System.out.println("Reason: Known trusted application generating low severity telemetry.");
        } 
        
        // Condition C: Catch-all for high severity alerts that need escalation.
        else if (severity.equalsIgnoreCase("High")) {
            System.out.println("Action: Manual Review required - Escalate to Tier 2.");
            System.out.println("Reason: High severity alerts cannot be automated.");
        } 
        
        // Condition D: The default action if none of the above specific scenarios are met.
        else {
            System.out.println("Action: Manual Review required.");
            System.out.println("Reason: Alert does not match standard auto-close parameters. Analyst investigation needed.");
        }

        // --- STEP 3: CLEANUP ---
        
        // Close the scanner object to free up system memory, which is a programming best practice.
        inputReader.close();
        System.out.println("--- Triage Complete ---");
    }
}
