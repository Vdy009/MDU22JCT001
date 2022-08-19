package data;

import java.util.function.Predicate;

public class PredicateExample {
	
	
	

	//--- and negate or---- ///
			
			
			
			 static Predicate<Integer> p = (i) -> { return i%2==0;};

			static 	Predicate<Integer> p1 = (i) ->  i%2==0;

	         static		Predicate<Integer> p2 = (i) ->  i%5==0;
			
		

	public static void main(String[] args) {

		//  Predicate<Integer> p = (i) -> { return i%2==0;};
	//	System.out.println(p.test( 4));
	
//--Lambda in single line--//
		
		//   Predicate<Integer> p1 = (i) ->  i%2==0;
	//	System.out.println(p1.test( 5));

//-----And-----// 
		
			System.out.println("Predicate And result is :"   + p1.and (p2).test( 10)); //PREDICATE CHAINING
			System.out.println("Predicate And result is :"   + p1.and (p2).test( 21)); //PREDICATE CHAINING

//-----OR---////
			
			System.out.println("Predicate OR result is :"   + p1.or (p2).test( 10)); //PREDICATE CHAINING
			System.out.println("Predicate OR result is :"   + p1.or (p2).test( 8)); //PREDICATE CHAINING
			
//---NEGATE(Reverse or Revert)---///
	
			System.out.println("Predicate Negate result is :"   + p1.negate ().test( 20)); //PREDICATE CHAINING
			System.out.println("Predicate Negate result is :"   + p1.negate ().test( 19)); //PREDICATE CHAINING
			
	}

}

