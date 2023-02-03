package in.ashokit.serviceInter;

import java.util.List;

import in.ashokit.entity.EducationDetails;
import in.ashokit.entity.IncomeDetails;
import in.ashokit.entity.KidDetails;

public interface ServiceInterface {

	public String findByAppId();
	
	public String getCaseId();
	
	public List<String> getPlanNames();
	
	public String saveIncomeDetails(IncomeDetails incomeDetails);
	
	public String saveEducationDetails(EducationDetails educationDetails);
	
	public String saveKidDetails(KidDetails kidDetails);
	
}
