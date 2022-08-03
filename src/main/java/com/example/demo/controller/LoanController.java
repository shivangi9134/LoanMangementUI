package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoanManagementSystem;
import com.example.demo.service.LoanService;

@RestController
public class LoanController {
	
	@Autowired
	private LoanService loanService;

	@GetMapping("/loans")
	public ResponseEntity<List<LoanManagementSystem>> getAllLoans(){
	return ResponseEntity.ok().body(loanService.getAllLoans());
	}

	@GetMapping("/loans/{id}")
	public ResponseEntity<LoanManagementSystem> getAllLoanById(@PathVariable long id){
	return ResponseEntity.ok().body(loanService.getLoanById(id));	
	}
	
	
//	 * @GetMapping("/loans/{firstname}") public
//	 * ResponseEntity<List<LoanManagementSystem>>
//	 * getAllLoanByFirstName(@PathVariable String firstname){ return
//	 * ResponseEntity.ok().body(loanService.getLoanByFirstName(firstname)); }
//	 */
	
	/*
	 * @GetMapping("/loans/{lastname}") public
	 * ResponseEntity<List<LoanManagementSystem>> getAllLoanByLastName(@PathVariable
	 * String lastname){ return
	 * ResponseEntity.ok().body(loanService.getLoanByLastName(lastname)); }
	 */
	
	/*
	 * @GetMapping("/loans/{loan_number}") public
	 * ResponseEntity<List<LoanManagementSystem>>
	 * getAllLoanByLoanNumber(@PathVariable int loan_number){ return
	 * ResponseEntity.ok().body(loanService.getLoanByLoanNumber(loan_number)); }
	 */

	@PostMapping("/loans")
	public ResponseEntity<LoanManagementSystem> createLoan(@RequestBody LoanManagementSystem loan){
	return ResponseEntity.ok().body(this.loanService.createLoan(loan));
	}

	@PutMapping("/loans/{id}")
	public ResponseEntity<LoanManagementSystem> updateLoan(@PathVariable long id, @RequestBody LoanManagementSystem loan){
	loan.setId(id);
	return ResponseEntity.ok().body(loanService.updateLoan(loan));
	}

	@DeleteMapping("/loans/{id}")
	public HttpStatus deleteLoan(@PathVariable long id){
	this.loanService.deleteLoan(id);
	return HttpStatus.OK;
	}

}
