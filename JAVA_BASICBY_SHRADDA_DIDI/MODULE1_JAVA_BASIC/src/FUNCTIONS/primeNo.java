package FUNCTIONS;

import java.util.Scanner;

public class primeNo {

	public static void primecheck(int n) {

		boolean flag = false;
		for (int i = 2; i <= n / 2; ++i) {
			// condition for nonprime number
			if (n % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter no : ");
		int n = sc.nextInt();
		primecheck(n);

	}

}
