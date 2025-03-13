package Collection_Set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetRealTimeExample {
	public static void main(String[] args) {
		
        HashSet<String> registeredUsers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a username to register (or type 'exit' to stop): ");
            String username = scanner.nextLine();
            
            if (username.equalsIgnoreCase("exit")) {
                break;
            }

            if (registeredUsers.add(username)) {
                System.out.println("User registered successfully!");
            } else {
                System.out.println("Username already taken. Please choose another.");
            }
        }

        System.out.println("Final registered users: " + registeredUsers);
        scanner.close();
    }
}
