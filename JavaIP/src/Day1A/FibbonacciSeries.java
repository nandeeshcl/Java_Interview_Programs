package Day1A;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int secound = 1;

		System.out.println(first + secound);
		int n = 10;
		int sum;

		sum = first + secound;

		for (int i = 2; i <= n; i++) {
			System.out.println(sum + " ");
		}
		secound  = first;
			sum = secound;
	
	System.out.println();
		}

	}
