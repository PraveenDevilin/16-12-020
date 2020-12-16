package org.Cons;

import java.util.Scanner;

public class Fibonacci {
	static int n1 = 0, n2 = 1, n3 = 0;

	static void fib(int count) {
		if (count > 0) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.print(" " + n3);
			fib(count - 1);
		}

	}

	private static int fact(int count) {

		if (count <= 1) {

			return 1;
		} else {
			return count * fact(count - 1);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value: ");
		int count = sc.nextInt();
		System.out.print(n1 + " " + n2);
		fib(count - 2);
		
		 System.out.println("\n The factorial of"+count+" is: " + fact(count));

	}

}
