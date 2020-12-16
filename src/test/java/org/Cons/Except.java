package org.Cons;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {

	private void out() {
		System.out.println(1);
		System.out.println(2);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input :");
		try {

			int a = sc.nextInt();
			try {
				System.out.println(4 / 0);
			}

			catch (InputMismatchException e) {
				e.printStackTrace();
			}

			catch (ArithmeticException e) {
				System.out.println("ari");
			} catch (NullPointerException e) {
				System.out.println("null");
			} finally {

				System.out.println("final words");
			}

		} catch (Exception e) {
			System.out.println("string");
		} finally {
			System.out.println("finally");

		}
		System.out.println(100);
	}

	private void in() throws IOException {
		System.out.println(500);

	}

	private void inter() {

		System.out.println("9999");

	}

	public static void main(String[] args) throws IOException, SQLDataException {
		Except ex = new Except();
		ex.out();
		ex.in();
		ex.inter();
		throw new SQLDataException();
	}

}
