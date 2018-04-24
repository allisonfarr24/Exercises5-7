import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		String answer;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Hello World!");

			System.out.println("Would you like to continue (y/n)?");
			answer = scan.nextLine();

		} while ((answer.equals("Y")) || (answer.equals("y")));

		scan.close();
	}

}
