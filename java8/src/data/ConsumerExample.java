package data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//------In different class-----//
	
	class ConsImpl implements Consumer<Integer>
	{

		@Override
		public void accept(Integer i) {
			// TODO Auto-generated method stub
			{
				
				System.out.println(i);
				
			}
		}
		
			
		public class ConsumerExample {

//--within same clas--///	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        List<Integer> values = Arrays.asList(4,5,6,7,8);
        
        // Consumer<Integer> c = new Consumer<Integer>()    
        // {
        	//public  void accept(Integer i) 
        	//{
        		//System.out.println(i);
        	//}
        // };
//---Using lambda expresion---///
         
     Consumer<Integer>  c =  i -> System.out.println(i);     
               
        values.forEach(c);
        
	    }

		}
}