package Entitiy;

import java.security.DrbgParameters.Capability;
import java.sql.Date;
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
public abstract class CapacityServive implements Callable<Integer> {


	StatusEntity request;
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(CapacityServive.class);
	
	CapacityServive(){
	}
	

	CapacityServive(StatusEntity request) {
		this.request = request;
	}
	
	private static List<Capability> capacityList = new ArrayList<>();

	static {
		try {
			CapacityEntity1.add(new CapacityEntity("Store001", "Prod1" , new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-28"), 1.0));
			capacityList.add(new CapacityEntity1("Store001", "Prod2" , new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-29"), 3.0));
			capacityList.add(new CapacityEntity1("Store001", "Prod3" , new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-39"), 2.0));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	@Override
	public Integer call() throws Exception {
		logger.info("Capacity Thread started Executing");
		Date reqDate = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(this.request.getReqQty());
		// TODO Auto-generated method stub
		return capacityList.stream().filter(capacity -> capacity.getDate().compareTo(reqDate) == 0)
									.filter(capacity -> capacity.getNoOfOrdersAccepted() > 0)
									.collect(Collectors.toList()).size();	
		
	}
	
	
}
