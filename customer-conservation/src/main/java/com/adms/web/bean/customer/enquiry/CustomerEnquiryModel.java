package com.adms.web.bean.customer.enquiry;

import java.io.Serializable;
import java.util.List;

import com.adms.entity.cs.Customer;
import com.adms.entity.cs.CustomerYesRecord;

public class CustomerEnquiryModel implements Serializable {

	private static final long serialVersionUID = -1137407173421271827L;
	
	private final String searchDlg = "SEARCH_DLG";
	private final String addCaseDlg = "ADD_CASE_DLG";
	
	private String dlgHeaderVal;
	private Customer customer;
	private List<Customer> customerFounds;
	private List<CustomerYesRecord> customerYRs;
	
	public CustomerEnquiryModel() {
		dlgHeaderVal = "";
	}

	public String getDlgHeaderVal() {
		return dlgHeaderVal;
	}

	public void setDlgHeaderVal(String dlgHeaderVal) {
		this.dlgHeaderVal = dlgHeaderVal;
	}

	public String getSearchDlg() {
		return searchDlg;
	}

	public String getAddCaseDlg() {
		return addCaseDlg;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<CustomerYesRecord> getCustomerYRs() {
		return customerYRs;
	}

	public void setCustomerYRs(List<CustomerYesRecord> customerYRs) {
		this.customerYRs = customerYRs;
	}

	public List<Customer> getCustomerFounds() {
		return customerFounds;
	}

	public void setCustomerFounds(List<Customer> customerFounds) {
		this.customerFounds = customerFounds;
	}

}
