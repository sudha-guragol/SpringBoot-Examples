package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.InsurancePlan;

public interface InsuranceRepository  extends JpaRepository<InsurancePlan, Serializable>{

}
