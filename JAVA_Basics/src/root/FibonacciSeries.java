package root;

import java.util.Scanner;

// 7. Generate Fibonacci series up to n terms.
public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 0;
		int first = 0, second = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to generate Fibonacci series: ");
			n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println(first + " ");
				int next = first + second;
				first = second;
				second = next;
			}
		}

	}

}
