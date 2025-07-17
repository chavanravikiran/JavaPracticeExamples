package FileUpload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInput {
	public static void main(String[] args) throws IOException 
	{
	// Create an InputStreamReader object using a standard input stream.
	   InputStreamReader isr = new InputStreamReader(System.in);	

	// Create BufferedReader object to take input from the keyboard.
	   BufferedReader br = new BufferedReader(isr); // Wrapping input stream reader into buffered reader.
	   
	// Prompt to enter a string from the user. 
	   System.out.println("Enter your first name: ");
	   String firstName = br.readLine(); // reading data.
	   System.out.println("Enter your last name: ");
	   String lastName = br.readLine();
	   String fullName = firstName +" " + lastName;
	   System.out.println("Full name: " +fullName);
	 }
}
