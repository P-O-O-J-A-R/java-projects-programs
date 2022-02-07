package learning;

//Overlapping range using hashmap
import java.util.*;

public class OverlappingRange 
{
	HashMap<Long, Long> range = new HashMap<Long, Long>() ;

	void populateCache()
	{
		//Storing ranges using homeNw as key 		
		range.put(10L, 20L) ;
		range.put(30L, 40L) ;
	}

	Map<Long, Long> getRangeFromCache(long from, long to)
	{
		Map<Long, Long> linkedrange = new LinkedHashMap<>();

		for (Map.Entry<Long, Long> ranges : range.entrySet()) {
			if((from >= ranges.getKey() && from <= ranges.getValue())
					|| (to >= ranges.getKey() && to <= ranges.getValue())
					|| (ranges.getKey() >= from && ranges.getValue() <= to))
			{
				linkedrange.put(ranges.getKey(), ranges.getValue());
			}
		}

		return linkedrange ;
	}

	public void main(String[] args)
	{
		populateCache() ;
		Scanner reader = new Scanner(System.in) ;
		System.out.println("Enter from number");
		long from = reader.nextLong();
		System.out.println("Enter to number");
		long to = reader.nextLong() ;
		Map<Long, Long> overlapRange = getRangeFromCache(from,to) ;
		if(overlapRange.size() >0)
		{
			for (Map.Entry<Long, Long> ranges : overlapRange.entrySet()) {
				System.out.println("Key: "+ranges.getKey()+" value: "+ranges.getValue());
			}
		}
		else
		{
			System.out.println("Not found");
		}
	}
}