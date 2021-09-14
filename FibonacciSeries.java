package day6problem;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1;
		int store;

		for (int i = 1; i <= 10; i++) {
			store = a + b;
			System.out.println(store);
			a = b;
			b = store;
		}
	}

}
