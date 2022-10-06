package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.InsurancePlan;
import in.ashokit.repository.InsuranceRepository;

@Service
public class InsuranceService {
	
@Autowired
	private InsuranceRepository planRepo;
	
	public void savePlan()
	{
		InsurancePlan plan=new InsurancePlan();
		plan.setPlanName("SNAP");
		plan.setPlanStatus("APPROVED");
	planRepo.save(plan);
	}

}
