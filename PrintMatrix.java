//program to print elements in matrix format
package learning;

import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		int m,n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Add size of matrix");
		System.out.println("Number of rows = ");
		m = scanner.nextInt() ;
		System.out.println("Number of columns = ");
		n = scanner.nextInt() ;
		System.out.println("Enter "+m*n+" elements for matrix");
		String[][] arr = new String[m][n] ;
		for(int i=0; i<m; i++)
			for(int j=0;j<n;j++)
				arr[i][j] = scanner.next() ;
		
		System.out.println("Matrix entered is ");
		for(int i=0; i<m; i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
