package ExamDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DateByDTO {




    private String storeNo;
    private String productId;
    private LocalDateTime reqDate;
    private String status;
	public String getStoreNo() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getProductId() {
		// TODO Auto-generated method stub
		return null;
	}



}
