package Arrays;

import java.util.Arrays;

public class Arrays_program {

	public static void main(String[] args) {
		String name="Dipti123";
		//int count_of_alpha= 0;
		//int count_of_numeric=0;
		char[]n1=name.toCharArray();
		
		for(int i=0;i<=name.length()-1;i++)
		{
		boolean answer =Character.isAlphabetic(n1[i]);
		
		if(answer==true)
		{
			System.out.println("Index position " + i +" is"+ " alphabet");
		}
		else
		{
			System.out.println("Index position " + i +" is"+ "  tnumeric");
		}
		}
	

		
	}

}
