package Controller;

import Domain.Availability;
import Domain.Capacity;
import ExamDTO.DateByDTO;
import Service.DateByService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/getProdAvailability")
public class DateController {

    @Autowired
    private DateByService dateByService;

    @PostMapping
    public ResponseEntity<DateByDTO> getDatesBy(@RequestBody DateByDTO dateByDTO) throws ExecutionException, InterruptedException {

        CompletableFuture<Availability> availability = dateByService.getAvailability(dateByDTO.getStoreNo(),
                dateByDTO.getProductId());


        CompletableFuture<Capacity> capacity = dateByService.getCapacity(dateByDTO.getStoreNo(),
                dateByDTO.getProductId());


        return ResponseEntity.ok(dateByDTO);


    }



}
