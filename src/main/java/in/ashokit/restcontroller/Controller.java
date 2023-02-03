package in.ashokit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.EducationDetails;
import in.ashokit.entity.IncomeDetails;
import in.ashokit.entity.KidDetails;
import in.ashokit.serviceInter.ServiceInterface;

@RestController
public class Controller {

	@Autowired
	private ServiceInterface ser;
	
	@GetMapping()
	public ResponseEntity<String> findByAppId() {
		String str = ser.findByAppId();
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<String> getCaseId(){
		String str = ser.getCaseId();
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<String>> findyByPlanNames(){
		List<String> planNames= ser.findyByPlanNames();
		return new ResponseEntity<>(planNames, HttpStatus.OK);
	}
	
	@PostMapping("/incomedetails")
	public String saveIncomeDetails(@RequestBody IncomeDetails incomeDetails) {
		String str = ser.saveIncomeDetails(incomeDetails);
		return "Income Details Successfully Saved";	
		}
	
	@PostMapping("/educationdetails")
	public String saveEducationDetails(@RequestBody EducationDetails educationDetails) {
		String str = ser.saveEducationDetails(educationDetails);
		return "Education Details Successfully Saved";	
	}
	
	@PostMapping("/kiddetails")
	public String saveKidDetails(@RequestBody KidDetails kidDetails) {
		String str = ser.saveKidDetails(kidDetails);
		return "Kid Details Successfully Saved";	
	}
}
