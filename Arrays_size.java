package Arrays;

import java.util.Scanner;

public class Arrays_size {

	public static void main(String[] args) {
		/*int num[]=new int[3];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		Scanner s1= new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the value of array");
			num[i]=s1.nextInt();
		}*/
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = s1.nextInt();
        
        // Create an array of the specified size
        int array[] = new int[size];
        
        System.out.println("Array size is: " + array.length);

	}

}
