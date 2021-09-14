package day6problem;

public class ReverseNum {
	public static void main(String[] args) {
		int rem, rev = 0, num = 1234;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println(rev);

	}
}
