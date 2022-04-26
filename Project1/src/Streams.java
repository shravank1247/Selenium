import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	//@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Aarun");
		name.add("Asha");
		name.add("Bisa");
		name.add("Zora");
		name.add("amma");
		name.add("Amar");
		
		int count = 0;
		for(int i=0; i<name.size();i++)
		{
			String check = name.get(i);
			if(check.startsWith("A"))
				count++;
		}
		System.out.println("Count of names starting with A is ::: "+count);
		
	}
	
	//@Test
	public void streamFilter()
	{
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("Arun");
		name1.add("Asha");
		name1.add("Bisa");
		name1.add("Aoraa");
		name1.add("amma");
		name1.add("Amarr");
		
		//Converting string array 
		//There is no life for intermediate operation if there is not terminal operation i.e filter without count no use
		//Terminal operation will execute only if intermediate operation returns true i.e filter returns True
		Long filter = name1.stream().filter(temp->temp.startsWith("A")).count();
		System.out.println("Count of names starting with A using Streams is::: "+filter);
		
		//Method-2
		//Declaring strings in stream compatible collection
		 Long str = Stream.of("Aa","Ab","Ba","Bd","ab","Bz").filter(s->
		 {
			 //Can add multiple conditions for filter
			 s.startsWith("B");
			 return true;
		 }).count();
		 System.out.println("Count of names starting with B using Stream collection is::: "+str);
		 
		 //print all names of ArrayList having len>4
		 name1.stream().filter(s->s.length()>4).forEach(s-> System.out.println("names having length >4 are :: "+s));
		 
		 //Limit results in Streams
		 name1.stream().filter(s->s.length()>3).limit(2).forEach(s-> System.out.println("names limit :: "+s)); 
	}

	//@Test
	public void streamMap()
	{
		//print names in uppercase which have last letter as A
		Stream.of("Aa","Ab","Ba","Bd","ab","Bz").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println("names in upper case ending with \"a\" are :: "+s));
		
		//print sorted names in uppercase which starts with A
		//Converting Strings to List for streams
		List<String> name2 = Arrays.asList("Aa","Ab","Ba","Bd","ab","Bz","Ac","Aa");
		name2.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println("sorted names in uppercase which starts with A ::: "+s));
		
		//Merging of 2 lists
		ArrayList<String> name = new ArrayList<String>();
		name.add("Aarun");
		name.add("Asha");
		Stream<String> newStream = Stream.concat(name.stream(), name2.stream());
		newStream.sorted().distinct().forEach(s->System.out.println("Merged new Stream is :: "+s));
		
		//Find the matched name from list
		boolean flag = name.stream().anyMatch(s->s.equalsIgnoreCase("Asha"));
		System.out.println("Matched name from list ::: "+flag);
		Assert.assertTrue(flag);		
	}

	@Test
	public void streamCollect()
	{
		//Use a list and convert into list after processing
		List<String> newList = Stream.of("Aa","Ab","Ba","Bd","ab","Bz").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("After converting processed list into list ::: "+newList.get(0));
		
		//Print unique numbers from array and sort
		List<Integer> numbers = Arrays.asList(2,2,7,5,9,7,4,8,8,7,7,9);
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		//Print 3rd index number after sorting
		Set<Integer> values = numbers.stream().distinct().sorted().collect(Collectors.toSet());
		List<Integer> values1 = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("3rd number from list if after processing ::: "+values1.get(2));
	}
}
