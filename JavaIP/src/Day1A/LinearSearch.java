package Day1A;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 50, 30 };
		int search_ele = 100;

		boolean flag = false;
		for (int s : a)

			if (search_ele == s)

			{
				System.out.println("Element found at "+ s);
				flag = true;
				break;

			}
		if (flag == false)

		{
			
			System.out.println("Element not found at");
		}

	}

}