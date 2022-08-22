package data;
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.stream.Stream;

	public class CollectionvsStreams {

	    public static void main(String[] args) {

	        ArrayList<String> names = new ArrayList<>();   // this can be Itreadted again and again
	        names.add("Adam");
	        names.add("Jim");
	        names.add("Jenny");

	        Stream<String> namesStream = names.stream();    // this can,t be itraeted again it can use only once 

	        namesStream.forEach(System.out::println);
	        //namesStream.forEach(System.out::println);

	    }
	}


