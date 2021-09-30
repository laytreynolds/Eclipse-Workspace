package com.qa.animalproject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long> {

	@Query(value = "SELECT * FROM Animals Where first_name = ?1", nativeQuery = true)
	List<Animal> findByname(String name);

}