package data;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
     BiConsumer<String,String> biConsumer = (a,b)->{
    	 System.out.println("a:" + a +", b:"+b);
     };
		
		biConsumer.accept("Java 7","Java 8");
		
//---Multiplication and division of two numbers with "andThen" of two numbers--//
		
		BiConsumer<Integer,Integer> multiply = (a,b)->{
			System.out.println("Multiplication is : "+ (a*b));
		};
      
		BiConsumer<Integer,Integer> division = (a,b)->{
			System.out.println("Division is : "+ (a/b));
		};
    
		multiply.andThen(division).accept(10,5);
		
		
	}

}
