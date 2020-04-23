package Day1A;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
	  int ch1[] = {1 ,2,3,4};
	  int ch2[] = {1,2,3,4};
	  
	  boolean  Status =  Arrays.equals(ch1, ch2);
	  
	  if(Status == true)
	  {  
		  System.out.println("ch1 = ch2 ");
	  }
	  else 
	  
		  System.out.println(  " ch1 != ch2  " );
	}

}
