package in.ashokit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Education_Details")
public class EducationDetails {

	@Id
	@GeneratedValue
	private Integer educationId;
	private String highestDegree;
	private Integer graduateYear;
	private String universityName;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="caseIdFk")
	private Plans plan;
}
