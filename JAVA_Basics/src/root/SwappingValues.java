package root;

import java.util.Scanner;

// 5. Swap two numbers without using a third variable.
public class SwappingValues {

	public static void main(String[] args) {
		int num1, num2;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st no");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd no");
			num2 = sc.nextInt();
		}
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("First number is: " + num1);
		System.out.println("Second number is: " + num2);
	}

}