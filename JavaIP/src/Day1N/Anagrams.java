package Day1N;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1="sarD";
		String s2="asr";
		
		char ch1[]= s1.toCharArray();
        char ch2[]=s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        String str1=new String(ch1);
        String str2=new String(ch2);

        if(str1.equals(str2))
        {
        	System.out.println("Anagaram");
        }
        
        else
        {
        	System.out.println("Not Anagram");
        }
        
        
        
        
	}

}
