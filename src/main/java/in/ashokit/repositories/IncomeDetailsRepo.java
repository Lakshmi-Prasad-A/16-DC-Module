package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.IncomeDetails;

public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails, Serializable> {

}
