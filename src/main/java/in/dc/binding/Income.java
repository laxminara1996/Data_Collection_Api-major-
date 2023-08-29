package in.dc.binding;

import lombok.Data;

@Data
public class Income {
	private Integer userId;
	private Double salaryIncome;
	private Double rentIncome;
	private Double propertyIncome;
	private Integer caseNum;
}
