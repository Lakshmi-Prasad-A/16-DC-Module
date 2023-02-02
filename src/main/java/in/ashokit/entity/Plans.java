package in.ashokit.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name="Plan_Tab")
public class Plans {

	@Id
	@GeneratedValue
	private String caseId;
	private String planNames;
}
