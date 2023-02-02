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
@Table(name="Kid_Details")

public class KidDetails {

	@Id
	@GeneratedValue
	private Integer kidId;
	private String kidName;
	private Integer kidAge;
	private String kSsn;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="caseIdFk")
	private Plans plan;
}
