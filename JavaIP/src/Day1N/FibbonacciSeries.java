package Day1N;

public class FibbonacciSeries {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;

		System.out.print(first + " " + second);

		int n = 10;

		int sum;

		for (int i = 2; i < n; i++) {

			sum = first + second;

			System.out.print(sum + " ");

			first = second;
			second = sum;

		}

		System.out.println();

	}

}
