package Arrays;
//count of alphabet,numeric and spaces in the given string
public class Arrays_alphanumericspace {

	public static void main(String[] args) {
		String name= "sky is 421";
		char[] c1=name.toCharArray();
		
		int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;
		
		
		for(int i=0;i<name.length();i++ )
		{
			boolean answer=Character.isAlphabetic(c1[i]);
			boolean answer1=Character.isDigit(c1[i]);
			boolean answer2=Character.isSpaceChar(c1[i]);
			 
			
			if(answer==true)
			{
				count_of_alpha++;
				
			}
			if(answer1==true)
			{
				count_of_numeric++;
				
			}
			if(answer2==true)
			{
				count_of_space++;
				
			}
			
		}
			System.out.println("Count of alphabet in the given string->"+count_of_alpha );
			System.out.println("Count of numeric in the given string->"+count_of_numeric );
			System.out.println("Count of spaces in the given string->"+count_of_space );
	}

}
