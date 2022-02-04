package learning;

import java.util.*;

//Java program to check if entered range lies in given ranges

public class CheckRangeExists {

	static boolean checkRangePresent(int[][] a, int number)
	{

		// container to store all range
		Vector<Integer> v = new Vector<>();

		// hash the L and R
		HashMap<Integer, Integer> mpp = new HashMap<>();

		// Push the element to container
		// and hash the L and R
		for (int i = 0; i < a.length; i++)
		{
			v.add(a[i][0]);
			mpp.put(a[i][0], 1);
			v.add(a[i][1]);
			mpp.put(a[i][1], 2);
		}

		// sort the elements in container
		Collections.sort(v);

		// get the number same or greater than integer
		int ind = lowerBound(v, number);
		if(ind == v.size()) {
			if(v.elementAt(ind-1) == number)
				return true ;
			else
				return false ;
		}

		// if it lies
		if (ind >= 0 && v.elementAt(ind) == number)
			return true ;
		else
		{
			// check if greater is hashed as 2
			if (ind >= 0 && mpp.get(v.elementAt(ind)) == 2)
				return true ;
			else // check if greater is hashed as 1
				return false ;
		}
	}

	// Lower bound implementation using binary search
	static int lowerBound(Vector<Integer> array, int value)
	{
		int low = 0;
		int high = array.size();
		while (low < high)
		{
			final int mid = (low + high) / 2;
			if (value <= array.elementAt(mid))
			{
				high = mid;
			}
			else
			{
				low = mid + 1;
			}
		}
		return low;
	}


	public static void main(String[] args)
	{
		int[][] a = {{ 5, 6 },  { 8, 10 }, { 15, 20 }};
		System.out.println("Enter from number to search");
		Scanner reader = new Scanner(System.in) ;
		int fromNumber = reader.nextInt() ;
		System.out.println("Enter to number to search");
		int toNumber = reader.nextInt() ;

		if(!checkRangePresent(a, fromNumber))
			if(!checkRangePresent(a, toNumber))
				System.out.println("No");
			else
				System.out.println("Yes");
		else
			System.out.println("Yes");

	}
}

