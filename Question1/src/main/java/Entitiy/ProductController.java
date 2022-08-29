package Entitiy;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class ProductController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping("/getAvailability ")
	public ResponseEntity<StatusEntity> getAvailability(@RequestBody StatusEntity request)
			throws InterruptedException, ExecutionException {

		ResponseEntity<StatusEntity> responseEntity = null;
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> availabilityFuture = executorService.submit(new AvailabilityService(request));
		Future<Integer> capacityFuture =  executorService.submit(new CapacityService(request));

		logger.info("availabilityFuture & capacityFuture will get the result seperately");
		
		
		if (availabilityFuture.get() == 1 && capacityFuture.get() == 0) {
			request.setStatus("No Capacity");
			responseEntity = new ResponseEntity<StatusEntity>(request, HttpStatus.OK);
		}
		if (availabilityFuture.get() == 1 && capacityFuture.get() == 1) {
			request.setStatus("Available");
			responseEntity = new ResponseEntity<StatusEntity>(request, HttpStatus.OK);
		}
		if (availabilityFuture.get() == 0 && capacityFuture.get() == 1) {
			responseEntity = new ResponseEntity<StatusEntity>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}	
	
}
