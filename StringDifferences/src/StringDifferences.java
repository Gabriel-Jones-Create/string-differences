import java.util.Scanner;

public class StringDifferences {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates a scanner for user input
		System.out.println("Enter string one:");// gives prompt for String one
		String inputStr1 = scan.nextLine();// sets String one to the input from the scanner
		System.out.println("Enter string two:");// gives prompt for String two
		String inputStr2 = scan.nextLine();// sets String two to the input from the scanner
		int shortestWordLength = 0; // creates shortest word length variable
		int diffCounter = 0; // sets a difference counter variable

		/*
		 * tests to see which string is shorter to use for iteration number in the for
		 * loop
		 */
		if (inputStr1.length() > inputStr2.length()) {
			shortestWordLength = inputStr2.length();
		} else {
			shortestWordLength = inputStr1.length();
		}

		/*
		 * iterates for the amount of the shortest string if the letters are different
		 * in the string, it prints the index and the difference. It also adds a counter
		 * of the number of differences.
		 */
		for (int i = 0; i < shortestWordLength; i++) {
			if (!inputStr1.substring(i, i + 1).equals(inputStr2.substring(i, i + 1))) {
				System.out.println(i + " " + inputStr1.substring(i, i + 1) + " " + inputStr2.substring(i, i + 1));
				diffCounter++;

			}
		}

		// prints the number of differences
		System.out.println("Number of Differences: " + diffCounter);
	}
}
