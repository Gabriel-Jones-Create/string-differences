import java.util.Scanner;
public class StringDifferences {
	public static void main(String[] args) {
		Scanner prompt1 = new Scanner(System.in);
		System.out.println("Enter string one:");
		Scanner prompt2 = new Scanner(System.in);
		System.out.println("Enter string two:");
		String inputStr1 = prompt1.nextLine();
		String inputStr2 = prompt2.nextLine();
		int shortestWordLength = 0;
		int diffCounter = 0;
		
		if(inputStr1.length() > inputStr2.length() ) {
			shortestWordLength = inputStr2.length();
		}
		else {
			shortestWordLength = inputStr1.length();
		}
		for( int i = 0 ; i < shortestWordLength; i++) {
			if(!inputStr1.substring(i,i+1).equals(inputStr2.substring(i,i+1))) {
				System.out.println(i + " " + inputStr1.substring(i,i+1) + " " + inputStr2.substring(i,i+1));
				diffCounter++;
				
			}
			
		}
		System.out.println("Number of Differences: "+ diffCounter);
		
	}
}
