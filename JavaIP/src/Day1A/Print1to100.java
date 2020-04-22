package Day1A;

import Day1A.Print;


class Print {

   
	static void p(int n) {
		
		if (n <= 100) {
			System.out.print(n + " "); // 1 2 3 .... 100
			n = n + 1; // 1=1+1=2 3 -----100 101
			p(n);
		}
	}
}

	
	public class Print1to100 {

		public static void main(String[] args) {

			// Print a = new Print();
			Print.p(10);
		}

	}

