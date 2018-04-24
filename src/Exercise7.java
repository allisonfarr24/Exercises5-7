import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		String userInput;
		String answer;

		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("Enter some text: ");
			userInput = scan.nextLine();
			System.out.println(userInput);

			System.out.println("Would you like to continue (y/n)? ");
			answer = scan.nextLine();

		} while ((answer.equals("y")) || (answer.equals("Y")));

		scan.close();
	}

}
