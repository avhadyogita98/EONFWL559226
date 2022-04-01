package javastream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Collect1 
{

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(12,67,84,23,74);
		IntSummaryStatistics stat=list.stream().collect(Collectors.summarizingInt(i->i));
		System.out.println(stat.getSum());
		System.out.println(stat.getCount());
		System.out.println(stat.getAverage());
		System.out.println(stat.getMin());
		System.out.println(stat.hashCode());
		System.out.println(stat.toString());
	}

}
