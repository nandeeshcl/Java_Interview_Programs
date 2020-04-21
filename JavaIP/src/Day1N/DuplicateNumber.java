package Day1N;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 2, 4, 2, 3 };

		Set<Integer> set = new HashSet<Integer>();

		for (int i : a) {
			if (set.add(i)) {

			} else {
				System.out.print(i + " ");
			}
		}

	}

}
