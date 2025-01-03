package root;

import java.util.Scanner;

// 10. Find the reverse of a number.
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int reversedNumber = 0;

		while (number != 0) {
			int digit = number % 10;
			System.out.println(digit);
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		System.out.println("Reversed Number: " + reversedNumber);
		scanner.close();
	}
}
