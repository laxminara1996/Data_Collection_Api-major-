package in.dc.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DC_PLAN_SELECTION")
@Data
public class PlanSelectionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer selectId;
	private Integer planId;
	private Integer caseNo;
}
