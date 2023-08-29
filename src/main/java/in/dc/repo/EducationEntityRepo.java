package in.dc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dc.entity.EducationEntity;

public interface EducationEntityRepo extends JpaRepository<EducationEntity, Integer> {

}
