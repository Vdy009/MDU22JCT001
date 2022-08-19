package com.learn.java;

import java.util.Comparator;

public class ComparatorLamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};	
			
		System.out.println("Result of the comparator is :" + comparator.compare( 3,2));//
			
//-----Implemented Using Lambda Way----//
		
		   Comparator<Integer> comparatorLambda = (Integer a , Integer b)-> a.compareTo(b);
		
			System.out.println("Result of the  lambda comparator is :" + comparatorLambda.compare( 3,2));//

//-----more easier syntax-----//
			
			   Comparator<Integer> comparatorLambda1 = ( a ,  b) -> a.compareTo(b);

				System.out.println("Result of the  lambda1 comparator is :" + comparatorLambda1.compare( 3,2));//

				
	}

}
