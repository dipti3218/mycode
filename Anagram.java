package Arrays;
//check if the strings are anagram to eachother
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String name1="chin";
		String name2="inch";
		
		if(name1.length()!=name2.length())
		{
			System.out.println("Sorry the given strings are not anagram");
		}
		else
		{
			char n1[]=name1.toCharArray();
			char n2[]=name2.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n2);
			//System.out.println(Arrays.toString(n1));
			//System.out.println(Arrays.toString(n2));
			
			
			boolean answer=Arrays.equals(n1, n2);
			
			if(answer==true)
			{
				System.out.println("the given two strings are anagram to eachother");
			}
			else
			{
				System.out.println("the given two strings are not anagram to eachother");
			}
		}

	}

}
