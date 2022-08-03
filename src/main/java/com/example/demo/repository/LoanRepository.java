package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LoanManagementSystem;

@Repository
public interface LoanRepository extends JpaRepository<LoanManagementSystem, Long>{
	
	//List<LoanManagementSystem> findByFirstName(String firstname);
	//List<LoanManagementSystem> findByLastName(String lastname);
	//List<LoanManagementSystem> findByLoanNumber(int loannumber);
}
