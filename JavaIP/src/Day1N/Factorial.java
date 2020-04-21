package Day1N;

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

		System.out.println("Factorial is: "+Test.fact(4));

	}

}
