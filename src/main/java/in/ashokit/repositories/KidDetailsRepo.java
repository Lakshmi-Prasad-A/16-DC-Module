package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.KidDetails;

public interface KidDetailsRepo extends JpaRepository<KidDetails, Serializable> {

}
