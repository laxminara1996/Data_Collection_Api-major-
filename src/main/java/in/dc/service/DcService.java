package in.dc.service;

import java.util.Map;

import in.dc.binding.Kids;
import in.dc.binding.DcSummary;
import in.dc.binding.Education;
import in.dc.binding.Income;
import in.dc.binding.Kid;
import in.dc.binding.PlanSelection;

public interface DcService {
public Map<Integer,String> getPlans();
public boolean savePlanSelection(PlanSelection planSelection);
public boolean saveIncome(Income income);
public boolean saveEducation(Education education);
public boolean saveKids(Kids kids);
public DcSummary fetchSummaryInfo(Long Num);

}
