import java.util.Scanner;

public class Hangman {

	
	public static void main(String[] args){
		System.out.println("Please enter your letter guess");
		Scanner scanner = new Scanner(System.in);
		String letter = scanner.next();
		System.out.println(letter);
		scanner.close();
		
	}
}
