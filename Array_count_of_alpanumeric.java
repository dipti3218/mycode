package Arrays;

public class Array_count_of_alpanumeric {

	public static void main(String[] args) {
		String name= "Diptiranjandas123";
		char[] c1=name.toCharArray();
		
		int count_of_alpha=0;
		int count_of_numeric=0;
		
		
		for(int i=0;i<=name.length()-1;i++ )
		{
			boolean answer=Character.isAlphabetic(c1[i]);
			
			if(answer==true)
			{
				count_of_alpha++;
				
			}
			else 
			{
				count_of_numeric++;
				
			}
		}
			System.out.println("Count of alphabet in the given string->"+count_of_alpha );
			System.out.println("Count of numeric in the given string->"+count_of_numeric );
		

	}

}
