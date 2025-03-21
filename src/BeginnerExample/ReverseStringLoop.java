package BeginnerExample;

import java.util.Scanner;

public class ReverseStringLoop {
	public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Reversed String: " + reverseString(input));
        
        //Another Way
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Direct way of Reversed String: " + reversed);
    }
}
