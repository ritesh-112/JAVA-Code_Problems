package root;

import java.util.Scanner;

// 9. Print all prime numbers within a range.
public class PrintAllNumbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to print a series: ");
			int num = sc.nextInt();
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}

}