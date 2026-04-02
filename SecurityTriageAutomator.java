// Import the Scanner class to enable reading input from the Security person
import java.util.Scanner;

public class SecurityTriageAutomator {

    // Main method defined per java requirements
    public static void main(String[] args) {

        // Using scanner object to capture user input
        Scanner inputReader = new Scanner(System.in);

        // Gather common details used for all events
        // These details are needed for every incident, so we ask them first
        System.out.println("--- Triage Process Start ---");
        
        System.out.print("Please provide your name: ");
        // Print statement for user data input and store user input to variable
        String responderName = inputReader.nextLine();

        System.out.print("Please input the current date and time: ");
        // Print statement for user data input and store user input to variable
        String timeDate = inputReader.nextLine();

        // Determine type of Security Incident
        System.out.print("Enter the Event Type (e.g., Unfamiliar Sign-in, Malware Detected): ");
        // Print statement for user data input and store user input to variable
        String eventType = inputReader.nextLine();
        

        // --- CONDITIONAL LOGIC ---
        // The program uses if/else statements to route the analyst to the correct questions.
        // We use .equalsIgnoreCase() so it accepts inputs like "malware detected" or "Malware Detected".

        // PATH 1: If the event is an Unfamiliar Sign-in, execute this block
        if (eventType.equalsIgnoreCase("Unfamiliar Sign-in")) {

            System.out.print("Please provide the user's username: ");
            String username = inputReader.nextLine();

            System.out.print("Have you reviewed the sign-in logs for malicious users for activity from countries which the user has not signed in from in the last 30 days? (Yes/No): ");
            String signInReview = inputReader.nextLine();

            System.out.print("Does the IP address in question show as malicious in known bad IP address engines such as Virus Total? (Yes/No): ");
            String vtIpVerdict = inputReader.nextLine();

            System.out.print("Please provide the IP address associated with the sign-ins: ");
            String ipAddress = inputReader.nextLine();

            System.out.print("Have you reset the user's password? (Yes/No): ");
            String userPwReset = inputReader.nextLine();

            System.out.print("Please provide any details for why 'no' was provided for any of the questions or any step which was not followed: ");
            String notes = inputReader.nextLine();

            // Output the final Incident Report for the Sign-in event
            System.out.println("\n--- INCIDENT REPORT ---");
            System.out.println("Incident Responder: " + responderName);
            System.out.println("Time and date: " + timeDate);
            System.out.println("Username of user: " + username);
            System.out.println("Sign in logs reviewed: " + signInReview);
            System.out.println("IP address documented: " + vtIpVerdict + " (" + ipAddress + ")");
            System.out.println("Have you reset the user's password: " + userPwReset);
            System.out.println("Additional information provided: " + notes);

        } 
        // PATH 2: If the event is Malware Detected, skip the sign-in block and execute this block
        else if (eventType.equalsIgnoreCase("Malware Detected")) {

            System.out.print("Please provide the user's username: ");
            String username = inputReader.nextLine();

            System.out.print("Please provide the user's machine name: ");
            String machineName = inputReader.nextLine();

            System.out.print("Have you issued a scan of the machine with all scan settings enabled? (Yes/No): ");
            String scanRun = inputReader.nextLine();

            System.out.print("Have all malicious files been quarantined? (Yes/No): ");
            String maliciousFiles = inputReader.nextLine();

            System.out.print("If malicious files haven’t been removed, isolate the device immediately and inform Security Leadership to activate the incident response plan. (Acknowledged/Isolated): ");
            String deviceIsolated = inputReader.nextLine();

            System.out.print("Please provide any details for why 'no' was provided for any of the questions or any step which was not followed: ");
            String notes = inputReader.nextLine();

            // Output the final Incident Report for the Malware event
            System.out.println("\n--- INCIDENT REPORT ---");
            System.out.println("Incident Responder: " + responderName);
            System.out.println("Time and date: " + timeDate);
            System.out.println("Username of user: " + username);
            System.out.println("Machine name: " + machineName);
            System.out.println("Scan issued: " + scanRun);
            System.out.println("Files quarantined: " + maliciousFiles);
            System.out.println("Device isolation status: " + deviceIsolated);
            System.out.println("Additional information provided: " + notes);

        } 
        // PATH 3: Error handling - if the input does not match either supported event type
        else {
            System.out.println("Error: Event type not recognized.");
            System.out.println("Please restart the program and enter either 'Unfamiliar Sign-in' or 'Malware Detected'.");
        }

        // --- CLEANUP ---
        // Close the scanner object to free up system resources, a standard Java best practice
        inputReader.close();
        
        System.out.println("\n--- Triage Complete ---");
    }
}
