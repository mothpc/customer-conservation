package com.adms.web.bean.customer.enquiry;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.springframework.data.domain.PageRequest;

import com.adms.entity.cs.ComplainLog;
import com.adms.web.base.bean.AbstractSearchBean;
import com.adms.web.base.bean.LanguageBean;
import com.adms.web.base.model.LazyModel;

@ManagedBean
@ViewScoped
public class CustomerEnquiryView extends AbstractSearchBean<ComplainLog> {

	private static final long serialVersionUID = -7189621707509848797L;
	
	@ManagedProperty(value="#{language}")
	private LanguageBean language;
	
	private ResourceBundle csMsg;
	
	private LazyModel<ComplainLog> complainLogModel;
	
	private CustomerEnquiryModel model;
	
	@PostConstruct
	private void init() {
		csMsg = ResourceBundle.getBundle("com.adms.msg.cs.csMsg", new Locale(language.getLocaleCode()));
		model = new CustomerEnquiryModel();
		setComplainLogModel(null);
	}
	
	public void prepDlg(String str) {
		if(str.equals(model.getSearchDlg())) {
			model.setDlgHeaderVal(csMsg.getString("modal.search.header.text"));
		} else {
			model.setDlgHeaderVal(csMsg.getString("modal.add.header.text"));
		}
	}
	
	public void doSearch() {
		System.out.println(model.toString());
	}

	@Override
	public List<ComplainLog> search(ComplainLog complainLog, PageRequest pageRequest) {
		try {
			
			return null;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Long getTotalCount(ComplainLog complainLog) {
		
		return null;
	}

	public LazyModel<ComplainLog> getComplainLogModel() {
		return complainLogModel;
	}

	public void setComplainLogModel(LazyModel<ComplainLog> complainLogModel) {
		this.complainLogModel = complainLogModel;
	}

	public CustomerEnquiryModel getModel() {
		return model;
	}

	public void setModel(CustomerEnquiryModel model) {
		this.model = model;
	}

	public void setLanguage(LanguageBean language) {
		this.language = language;
	}

}
