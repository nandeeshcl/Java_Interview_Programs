package Day1A;

public class EvenOddfromArray {

	public static void main(String[] args) {
	
			
			int a[]= {1,2,3,4,5,6};
			
			for(int i:a)
			{
				if(i%2!=0)
				{
					System.out.println("Odd numbers in array :" +i);  //1 3 5
		
				}
		
			if ( i%2==0)
			{
				System.out.println("Even  numbers in array : " +i); 
			}
	}

}}
