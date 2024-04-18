package Arrays;
//find out the index number of spaces in the given string
public class Arrays_space {

	public static void main(String[] args) {
		String name= "Dipti Ranjan Das";
		char[] c1	=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			boolean answer= Character.isSpaceChar(c1[i]);
			
			if(answer==true)
			{
				System.out.println("space is there in the given string"+ " the index of space is" + i);
			}
		}

	}

}
