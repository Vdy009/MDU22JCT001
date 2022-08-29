package Entitiy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;


@Component
public class AvailabilityService implements Callable<Integer> {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(AvailabilityService.class);
	private Object request;
	
	AvailabilityService(){
	}

		
		AvailabilityService(StatusEntity request){
			this.request = request;
			
			
		}
		
       		private static List<AvailabilityEntity> availability = new ArrayList<>();
       		
       		
       		static {
       			
       			try {
       				//Availability ("Store001", "Prod1", new Date(2021 - 10 - 29), 1.0) 
       				availability.add( new AvailabilityEntity
       						("Store001", "Prod1", new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-29"), 1.0));
  
       				availability.add( new AvailabilityEntity
       						("Store001", "Prod2", new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-26"), 3.0));
       				
       				availability.add( new AvailabilityEntity
       						("Store001", "Prod3", new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-25"), 2.0));
       			}
       			
       			catch (ParseException e) {
       				// TODO Auto-generated catch block
       				e.printStackTrace();
       			
       			
       			}
       		}
       		
       		@Override
       		public Integer call() throws Exception {
       			logger.info("Availability Thread  Executing");
       			Date reqDate = new SimpleDateFormat("yyyy-MM-dd").parse(this.request.getReqDate());
       			// TODO Auto-generated method stub
       			
       			
       			
       			return availabilityList.stream().filter(availability -> availability.getDate().compareTo(reqDate) == 0)
       					.filter(availability -> availability.getAvailQty() > 0).collect(Collectors.toList()).size();
	
	}
}