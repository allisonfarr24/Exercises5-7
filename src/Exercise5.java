import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num1 = scan.nextInt();

		System.out.println("Please enter another number: ");
		num2 = scan.nextInt();

		sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

}
