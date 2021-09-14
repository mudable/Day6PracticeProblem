package day6problem;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String args[]) {
		System.out.println("Enter no to check for prime");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int store = 0;
		for (int i = 2; i < no - 1; i++) {
			if (no % i == 0) {
				store = store + 1;

			}
		}
		if (store > 0) {
			System.out.println(" not a  prime number");
		} else {
			System.out.println(" is a prime no");
		}
	}

}
