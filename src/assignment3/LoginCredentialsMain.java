package assignment3;

import java.util.Scanner;

public class LoginCredentialsMain {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	String existingId= " pivotAdmin";
	String password = "Admin123";
	int maxAttempts= 3;
	int attempts= 0;
	String username= scanner.nextLine();
	String password1= scanner.nextLine();
	 boolean login= false;
	
	while (maxAttempts > attempts) {
	System.out.println("Enter the Username");
	System.out.println("Enter the Password");
	if (username.equals(existingId && password1.equals(password1))) {
		logIn = true;
        System.out.println("You are logged in to the application.");
        break;
	}

}}}
