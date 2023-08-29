package in.dc.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.dc.binding.Kid;
import in.dc.binding.Education;
import in.dc.binding.Income;
import in.dc.binding.PlanSelection;
import in.dc.entity.KidEntity;
import in.dc.entity.EducationEntity;
import in.dc.entity.IncomeEntity;
import in.dc.entity.PlanSelectionEntity;
import in.dc.repo.KidEnityRepo;
import in.dc.repo.EducationEntityRepo;
import in.dc.repo.IncomeEntityRepo;
import in.dc.repo.PlanSelectionEntityRepo;

@Service
public class DcServiceImpl implements DcService {
	@Autowired
	private PlanSelectionEntityRepo planRepo;
	@Autowired
	private IncomeEntityRepo incomeRepo;
	@Autowired
    private EducationEntityRepo educationRepo;
	@Autowired
	private KidEnityRepo childRepo;
	public boolean createPlan(PlanSelection planSelection) {
		PlanSelectionEntity entity = new PlanSelectionEntity();
		BeanUtils.copyProperties(planSelection, entity);
		entity.setPlanId(planSelection.getPlanId());
		entity.setCaseNo(planSelection.getCaseNo());
		planRepo.save(entity);
		return true;
	}

	public boolean createIncome(Income income) {
		IncomeEntity entity = new IncomeEntity();
		BeanUtils.copyProperties(income, entity);
		entity.setSalaryIncome(income.getSalaryIncome());
		entity.setRentIncome(income.getRentIncome());
		entity.setPropertyIncome(income.getPropertyIncome());
		entity.setCaseNo(income.getCaseNo());
		incomeRepo.save(entity);
		return true;
	}

	public boolean createEducation(Education education) {
		EducationEntity entity = new EducationEntity();
		BeanUtils.copyProperties(education, entity);
        entity.setHighestDegree(education.getHighestDegree());
        entity.setGraduationYear(education.getGraduationYear());
        entity.setUniversity(education.getUniversity());
        entity.setCaseNo(education.getCaseNo());
        educationRepo.save(entity);
		return true;
	}

	public boolean createChildren(Kid children) {
		KidEntity entity = new KidEntity();
		BeanUtils.copyProperties(children, entity);
		entity.setChildname(children.getChildname());
		entity.setChildDob(children.getChildDob());
		entity.setChildSsn(children.getChildSsn());
		entity.setCaseNo(children.getCaseNo());
		childRepo.save(entity);
		return true;
	}

	public List<IncomeEntity> getIncomeData() {
		List<IncomeEntity> data = incomeRepo.findAll();
		return data;
	}

	public List<EducationEntity> getEducationData() {
		List<EducationEntity> data = educationRepo.findAll();
		return data;
	}

	public List<KidEntity> getKidsData() {
		List<KidEntity> data = childRepo.findAll();
		return data;
	}

}
