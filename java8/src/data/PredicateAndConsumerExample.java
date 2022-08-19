package data;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
	
	
	Predicate <Student> p1 = s -> s.getGrade()>=3;
	Predicate <Student> p2 = s -> s.getGpa()>=3;

	BiConsumer<Sring,List<String> studentBiConsumer = (name,activities) ->  System.out.println(name + ":" +  activities);
	
	
	Consumer<Student> studentConsumer = (student -> {
		
		if(p1.and(p2).test(student)) {
			
		}
	});
	
	
	public void printNameAndActivities() {
		
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
