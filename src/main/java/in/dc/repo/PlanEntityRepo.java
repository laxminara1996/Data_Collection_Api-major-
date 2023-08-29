package in.dc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dc.entity.PlanEntity;


public interface PlanEntityRepo extends JpaRepository<PlanEntity, Integer> {

}
