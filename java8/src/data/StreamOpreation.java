package data;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOpreation {
	
	//Intermediate OPreation//
	
	/*     anymatch(),distinct(),filter(),findFirst(),flatmap(),map(),skip(),sorted().
	 * Generally used belw-----------
	 * filter(predicate) Method.
       sorted() Method.
       distinct() Method.
       map() Method.
	 * 
	 */

	// Terminal Opreation//
	/*
	 * forEach
	 * collect
	 * reduce------
	 *            count() max() min() reduce() summary statics()
	 *             
	 * 
	 */
	
	public static void  main(String[] args) throws IOException  {
		//1.INTEGER STREAM
		IntStream       
		  .range(1,10)
		.forEach(System.out::print);
		 System.out.println();
		  
		//2.Integer stream with skip 
		 
		 IntStream
		  .range(1,10)
		  .skip(5)
		.forEach(System.out::print);
		 System.out.println();
		 
		 //3.Integer stream With Sum
		 System.out.println(
		 IntStream           //use to create object
		  .range(1,5)
		  .sum());
		 System.out.println();
		 
		 //4.Stream.of sorted and findFirst
		 Stream.of("Ava","Alok","Aayan")
		 .sorted()
		 .findFirst()
		 .ifPresent(System.out::println);
		 
		 //5.Stream from Array,Sort,Filter,and print
		 String[] names = {"Al","Ankit","Kushal","Sumit","Sarita","amanda","hans","Shivika","Santosh"};	
	     Arrays.stream(names) //same as Streams.of(names)
	     .filter(x->x.startsWith("S"))
	     .sorted()
	     .forEach(System.out::println);
	     
	     //6.average of square of an int array
	     Arrays.stream(new int[] {2, 4, 6, 8, 10})
	     .map(x -> x*x)
	     .average()
		 .ifPresent(System.out::println);

	     //7.Stream from List,Filter and Print
	     List<String> people = Arrays.asList("Aman","Ankita","Kushala","Sunita","Saritaa","amanda","hansika","Shiva","Satya");
	     people
	     .stream()
         .map(String::toUpperCase)
         .filter(x -> x.startsWith("A"))
         .forEach(System.out::println);	    		 
	     
	     
	    //8. Stream rows from text file,sort,filter,and print
	     
	    // Stream<String> bands = Files.lines(Paths.get("bands.txt"));
	    // bands
	    // .sorted().
	    // filter(x -> x.length() > 13).
	    // forEach(System.out::println);
	    // bands.close();
	     
	     //9.Reduction - sum
	     double total = Stream.of(7.3,1.5,4.8)
	    	.reduce(0.0,(Double a, Double b) -> a + b);
	     System.out.println("Total = " + total);
	     
	     //10.Reduction - summary statisticts 
	     IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
	    		 .summaryStatistics();
	     System.out.println(summary);
	     
}
	
}