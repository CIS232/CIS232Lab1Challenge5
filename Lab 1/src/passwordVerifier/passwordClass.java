package passwordVerifier;

import java.util.Scanner;

public class passwordClass {

	public static boolean checkPassword(String password) {
		int caseLower = 0; // declare lower case
		int caseUpper = 0; // declare upper case
		int numberDigit = 0; // declare digits
		int length = password.length();
		if (length >= 6) { // length of password is at least 6 characters
			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i))) {
					caseUpper = 1;
				}
				if (Character.isLowerCase(password.charAt(i))) {
					caseLower = 1;
				}
				if (Character.isDigit(password.charAt(i))) {
					numberDigit = 1;
				}
			}
			if (caseUpper == 1 && caseLower == 1 && numberDigit == 1) //has at least one of each
				return true;
			else
				return false;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Enter a Password: "); //user inputs a password
			String password = in.nextLine();
			boolean result = passwordClass.checkPassword(password); 
			if (result == true) {
				System.out.println("You have entered a valid password! "); //password qualifies
				break;
			} else {
				System.out.println("The password you entered is INVALID!\n "
						+ "Enter a different password!"); //password does not qualify
			}
		} while (true);
	}
}