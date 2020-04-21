package Day1A;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {

		char a[] = { 1, 2, 3, 2, 1 };

		Set<Integer> set = new HashSet<Integer>();

		boolean flag = false;

		for (int i : a)

			if (set.add(i) == false)

			{
				System.out.println("duplicate element is " + i);

				flag = true;
			}

		if (flag == false)

		{
			System.out.println(" No Duplicate element ");
		}
	}

}
