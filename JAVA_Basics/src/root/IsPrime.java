package root;

import java.util.Scanner;

// 8. Check if a number is prime.
public class IsPrime {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = 0;
			System.out.println("Enter a number to check if it is a prime no: ");
			num = sc.nextInt();
			if (num % 2 != 0) {
				System.out.println(num + " is prime number.");
			} else {
				System.out.println(num + " is not a prime number.");
			}
		}
	}

}
