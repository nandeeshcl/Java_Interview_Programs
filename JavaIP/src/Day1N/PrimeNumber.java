package Day1N;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 6;

		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count = count + 1;
				break;
			}
		}

		if (count == 0) {
			System.out.println("Prime");
		}count

		else {
			System.out.println("Not Prime");
		}

	}

}
