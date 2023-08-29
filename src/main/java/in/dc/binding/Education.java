package in.dc.binding;

import lombok.Data;

@Data
public class Education {
	private Integer userId;
	private String highestDegree;
	private Integer graduationYear;
	private String university;
	private Integer caseNum;
}
