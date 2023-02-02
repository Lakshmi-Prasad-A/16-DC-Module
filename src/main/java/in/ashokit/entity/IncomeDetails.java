package in.ashokit.entity;

import javax.annotation.Generated;
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
@Table(name="Income_Details")
public class IncomeDetails {

	@Id
	@GeneratedValue
	private Integer incomeId;
	private Double monthlySal;
	private Integer rent;
	private String property;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="caseIdFk")
	private Plans plan;
	
}
