package root;

// 3. Check if a number is even or odd.
public class EvenOrOdd {

	private static boolean check(int num) {
		if ((num % 2) == 0) {
			System.out.println(num + " is Even");
			return true;
		} else {
			System.out.println(num + " is Odd");
			return false;
		}
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		EvenOrOdd.check(a);
		EvenOrOdd.check(b);
	}

}
