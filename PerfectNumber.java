package day6problem;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int num, sum = 0;
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {    
				sum = sum + i;
			}
		}
			if (num == sum) 
				System.out.println("Number is a perfect number");
			else 
				System.out.println("Number is not a perfect number");

			}
		}

	


