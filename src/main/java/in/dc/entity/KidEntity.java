package in.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DC_CHILDREN")
@Data
public class KidEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer childId;
	private String childname;
	private String childDob;
	private Integer childSsn;
	private Integer caseNo;
}
