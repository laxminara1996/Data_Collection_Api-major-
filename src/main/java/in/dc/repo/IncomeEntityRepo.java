package in.dc.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import in.dc.entity.IncomeEntity;

public interface IncomeEntityRepo extends JpaRepository<IncomeEntity, Integer> {

}
