package learning;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) 
	{
		System.out.println("Enter number of rows");
		Scanner reader = new Scanner(System.in) ;
		int rows = reader.nextInt() ;
		int k=1;
		System.out.println("Floyd's Triangle");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				System.out.print(k+++" ");
			}
			System.out.println();
		}
		
		k= rows*(rows+1)/2 ;
		System.out.println();
		System.out.println("Reverse Floyd's Triangle");
		for(int i=rows; i>=0; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(k--+" ");
			}
			System.out.println();
		}

	}

}
