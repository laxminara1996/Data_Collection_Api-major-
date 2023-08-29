package in.dc.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.dc.binding.Kid;
import in.dc.binding.Kids;
import in.dc.binding.DcSummary;
import in.dc.binding.Education;
import in.dc.binding.Income;
import in.dc.binding.PlanSelection;
import in.dc.entity.KidEntity;
import in.dc.entity.EducationEntity;
import in.dc.entity.IncomeEntity;
import in.dc.service.DcService;

@RestController
public class DcRestController {
	@Autowired
	private DcService service;

	public Map<Integer,String> getPlans(){
		return service.getPlans();
	}
	@PostMapping(value = "/planselection")
	public ResponseEntity<String> savePlanSelection(@RequestBody PlanSelection planSelection) {
		System.out.println(planSelection);
		boolean status = service.savePlanSelection(planSelection);
		if (status) {
			return new ResponseEntity<String>("plan selection saved",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("problem occured",HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	@PostMapping(value = "/income")
	public ResponseEntity<String> saveIncome(@RequestBody Income income) {
		System.out.println(income);
		boolean status = service.saveIncome(income);
		if (status) {
			return new ResponseEntity<String>("income details saved",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("problem occured",HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	@PostMapping(value = "/education")
	public ResponseEntity<String> saveEducation(@RequestBody Education eduction) {
		boolean status = service.saveEducation(eduction);
		if (status) {
			return new ResponseEntity<String>("education saved",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("problem occured",HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	@PostMapping(value = "/kids", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> saveKid(@RequestBody Kids kids) {
		boolean status = service.saveKids(kids);
		if (status) {
			return new ResponseEntity<String>("kids data saved",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("problem occured",HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	@GetMapping(value="/dc-summaary/{caseNum}")
	public ResponseEntity<DcSummary> getDcSummary(@PathVariable Long caseNum) {
		DcSummary summaryInfo = service.fetchSummaryInfo(caseNum);
		 return new ResponseEntity<DcSummary>(summaryInfo, HttpStatus.OK);
	}
	
}
