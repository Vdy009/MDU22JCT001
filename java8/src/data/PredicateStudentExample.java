package data;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
	
		static Predicate<Student> p1 = (s) -> s.getGrade()>=3;
		
		public static void filterStudentByGrade() {
			
			List<Student> studentList = StudentDataBase.getAllStudents(); 
			studentList.forEach((student -> { 
			
			if(p1.test(student)) {
				
				System.out.println(student);
			}
			
			}));
			
			
		}
			
		public static void main(String args) {
			
			filterStudentByGrade();

			    
		}

}
