package Day1A;

import Day1A.Test;

class Test {
	static int fact(int n) {
		
		if (n == 0) {
			return 1;
		}

		else {
			return n * fact(n - 1);
		}
	}
}

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Factorial is: "+Test.fact(5));

	}

}
