package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.EducationDetails;

public interface EducationDetailsRepo extends JpaRepository<EducationDetails, Serializable> {

}
