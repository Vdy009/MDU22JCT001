package com.learn.java;

public class RunnableInterfaceExample {

	public static void main(String[] args) {
		
/**
 * prior java 8
 */
	//without lambda Expression//
		
		Runnable runnable = new Runnable() {
         
        	  @Override
              public void run() {
	            // TODO Auto-generated method stub
	
        		  System.out.println("Inside Runnable 1");
          }
        	  
		};			
			new Thread(runnable).start();
			
//-------java 8 lamda syntax ---------// ()->{};
			
			
			Runnable runnableLambda = ()->{
				System.out.println("Lamda start");
			};
			
			new Thread(runnableLambda).start();

//------in more Simpler way---///
			
			Runnable runnableLambda1 = ()->{ System.out.println("Lamda In single line");};
              			new Thread(runnableLambda1).start();
              			
// more simpler way//
              			
              			new Thread(()-> System.out.println("Lamda 4")).start();

              			
              			
              			
	}
}
