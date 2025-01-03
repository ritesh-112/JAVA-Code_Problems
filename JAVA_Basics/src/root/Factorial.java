package root;

import java.util.Scanner;

// 6. Calculate the factorial of a number.
public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		int num = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to calculate factorial: ");
			num = sc.nextInt();
		}
		for (int i = 1; i <= 10; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a " + num + " is: " + fact);
	}

}
