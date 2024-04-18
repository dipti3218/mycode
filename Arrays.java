  package Arrays;
//write down an array of length of 4 in int datatype and findout if 34 is present or not
public class Arrays {

	public static void main(String[] args) {
		int number[]= new int[3];
		number[0]= 100;
		number[1]= 200;
		//number[2]= 300;
		number[2]=34;
		int num_to_check=34;
		
		for(int i=0;i<=2;i++) 
		{
			if(num_to_check==number[i])
			{
				System.out.println("found the number");
			}
			else 
			{
				System.out.println("number not found");
			}
			
		}

	}

}
