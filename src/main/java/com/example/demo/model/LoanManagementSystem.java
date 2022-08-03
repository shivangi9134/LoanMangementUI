package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class LoanManagementSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/*
	 * @Column(name = "loannumber") private int loannumber;
	 */
	
	@Column(name = "loan_amount")
	private long loan_amount;

	/*
	 * @Column(name = "firstname") private String firstname;
	 * 
	 * @Column(name = "lastname") private String lastname;
	 */
	
	@Column(name = "property_address")
	private String property_address;
	
	@Column(name = "loan_term")
	private String loan_term;
	
	@Column(name = "loan_type")
	private String loan_type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*
	 * public int getLoan_number() { return loannumber; }
	 */
	/*
	 * public void setLoan_number(int loan_number) { this.loannumber = loannumber; }
	 */

	public long getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(long loan_amount) {
		this.loan_amount = loan_amount;
	}

	/*
	 * public String getfirstname() { return firstname; }
	 * 
	 * public void setfirstname(String firstname) { this.firstname = firstname; }
	 * 
	 * public String getlastname() { return lastname; }
	 * 
	 * public void setlastname(String lastname) { this.lastname = lastname; }
	 */

	public String getProperty_address() {
		return property_address;
	}

	public void setProperty_address(String property_address) {
		this.property_address = property_address;
	}

	public String getLoan_term() {
		return loan_term;
	}

	public void setLoan_term(String loan_term) {
		this.loan_term = loan_term;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	
}
