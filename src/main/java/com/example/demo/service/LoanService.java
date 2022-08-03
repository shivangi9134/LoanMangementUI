package com.example.demo.service;

import java.util.List;

import com.example.demo.model.LoanManagementSystem;

public interface LoanService {

	LoanManagementSystem createLoan(LoanManagementSystem loan);
	LoanManagementSystem updateLoan(LoanManagementSystem loan);
	List <LoanManagementSystem> getAllLoans();
	LoanManagementSystem getLoanById(long loan_id);
	//List <LoanManagementSystem> getLoanByFirstName(String first_name);
	//List <LoanManagementSystem> getLoanByLastName(String last_name);
	//List <LoanManagementSystem> getLoanByLoanNumber(int loan_number);
	void deleteLoan (long id);
}
