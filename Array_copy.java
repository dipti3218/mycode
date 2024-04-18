package Arrays;

import java.util.Arrays;

public class Array_copy {

	public static void main(String[] args) {
		int array1[]=new int[4];
		 array1[0]=100;
		 array1[1]=200;
		 array1[2]=213;
		 array1[3]=414;
		 
		 
		 int array2[]=new int [array1.length];
								
	for(int i=0;i<4;i++)
	{
		array2[i]=array1[i];
	}
	
	System.out.println(Arrays.toString(array2));
	  
	}

}
