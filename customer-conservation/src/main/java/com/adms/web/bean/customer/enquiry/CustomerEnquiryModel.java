package com.adms.web.bean.customer.enquiry;

import java.io.Serializable;

import com.adms.entity.cs.Customer;

public class CustomerEnquiryModel implements Serializable {

	private static final long serialVersionUID = -1137407173421271827L;
	
	private final String searchDlg = "SEARCH_DLG";
	private final String addCaseDlg = "ADD_CASE_DLG";
	
	private String dlgHeaderVal;
	private Customer customer;
	
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

}
