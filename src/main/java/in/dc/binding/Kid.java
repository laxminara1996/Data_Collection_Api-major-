package in.dc.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Kid {
	private Integer userId;
	private String kidname;
	private LocalDate kidDob;
	private Long kidSsn;
	private Integer caseNum;
}
