package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.PlanNames;

public interface PlanNamesRepo extends JpaRepository<PlanNames, Serializable> {

}
