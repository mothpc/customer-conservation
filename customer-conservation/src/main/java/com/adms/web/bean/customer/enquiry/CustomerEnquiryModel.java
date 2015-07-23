package com.adms.web.bean.customer.enquiry;

import java.io.Serializable;

public class CustomerEnquiryModel implements Serializable {

	private static final long serialVersionUID = -1137407173421271827L;
	
	private final String searchDlg = "SEARCH_DLG";
	private final String addCaseDlg = "ADD_CASE_DLG";
	
	private String dlgHeaderVal;
	
	private String insuredFname;
	private String insuredLname;
	private String insuredFullName;
	private String insuredCitizenId;
	
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

	public String getInsuredFname() {
		return insuredFname;
	}

	public void setInsuredFname(String insuredFname) {
		this.insuredFname = insuredFname;
	}

	public String getInsuredLname() {
		return insuredLname;
	}

	public void setInsuredLname(String insuredLname) {
		this.insuredLname = insuredLname;
	}

	public String getInsuredCitizenId() {
		return insuredCitizenId;
	}

	public void setInsuredCitizenId(String insuredCitizenId) {
		this.insuredCitizenId = insuredCitizenId;
	}

	@Override
	public String toString() {
		return "CustomerEnquiryModel [insuredFname=" + insuredFname + ", insuredLname=" + insuredLname
				+ ", insuredCitizenId=" + insuredCitizenId + "]";
	}

	public String getInsuredFullName() {
		return insuredFullName;
	}

	public void setInsuredFullName(String insuredFullName) {
		this.insuredFullName = insuredFullName;
	}

}
