package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.LoanManagementSystem;
import com.example.demo.repository.LoanRepository;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	private LoanRepository loanRepository;

	@Override
	public LoanManagementSystem createLoan(LoanManagementSystem loan) {
		return loanRepository.save(loan);
	}

	@Override
	public LoanManagementSystem updateLoan(LoanManagementSystem loan) {
		Optional<LoanManagementSystem> loanDb = this.loanRepository.findById(loan.getId());
		if(loanDb.isPresent()){
			LoanManagementSystem loanUpdate = loanDb.get();
			loanUpdate.setId(loan.getId());
			//loanUpdate.setLoan_number(loan.getLoan_number());
			loanUpdate.setLoan_amount(loan.getLoan_amount());
			//loanUpdate.setfirstname(loan.getfirstname());
			//loanUpdate.setlastname(loan.getlastname());
			loanUpdate.setProperty_address(loan.getProperty_address());
			loanUpdate.setLoan_term(loan.getLoan_term());
			loanUpdate.setLoan_type(loan.getLoan_type());
			loanRepository.save(loanUpdate);
			return loan;
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + loan.getId());
		}
	}

	@Override
	public List<LoanManagementSystem> getAllLoans() {
		return this.loanRepository.findAll();
	}

	@Override
	public LoanManagementSystem getLoanById(long loanId) {
		Optional<LoanManagementSystem> loanDb = this.loanRepository.findById(loanId);
		if(loanDb.isPresent()){
			return loanDb.get();
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + loanId);
		}
	}
	

	/*
	 * @Override public List<LoanManagementSystem> getLoanByFirstName(String
	 * firstname) { return this.loanRepository.findByFirstName(firstname); }
	 */

	/*
	 * @Override public List<LoanManagementSystem> getLoanByLastName(String
	 * lastname) { return this.loanRepository.findByLastName(lastname); }
	 */
	/*
	 * @Override public List<LoanManagementSystem> getLoanByLoanNumber(int
	 * loan_number) { return this.loanRepository.findByLoanNumber(loan_number); }
	 */
	
	@Override
	public void deleteLoan(long loanId) {
		Optional<LoanManagementSystem> loanDb = this.loanRepository.findById(loanId);
		if(loanDb.isPresent()){
			this.loanRepository.delete(loanDb.get());
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + loanId);
		}
	}

}
