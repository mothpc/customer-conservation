package com.adms.web.bean.customer.enquiry;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.primefaces.context.RequestContext;
import org.springframework.data.domain.PageRequest;

import com.adms.cs.service.CustomerService;
import com.adms.entity.cs.ComplainLog;
import com.adms.entity.cs.Customer;
import com.adms.web.base.bean.AbstractSearchBean;
import com.adms.web.base.bean.LanguageBean;
import com.adms.web.base.model.LazyModel;

@ManagedBean
@ViewScoped
public class CustomerEnquiryView extends AbstractSearchBean<ComplainLog> {

	private static final long serialVersionUID = -7189621707509848797L;
	
	@ManagedProperty(value="#{language}")
	private LanguageBean language;
	
	@ManagedProperty(value="#{customerService}")
	private CustomerService customerService;
	
	private ResourceBundle csMsg;
	private LazyModel<ComplainLog> complainLogModel;
	private CustomerEnquiryModel model;
	
	private String shCitizenId;
	private String shFirstName;
	private String shLastName;
	
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
	
	public void doSearch() throws Exception {
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		if(!StringUtils.isBlank(shCitizenId)) criteria.add(Restrictions.eq("citizenId", shCitizenId));
		if(!StringUtils.isBlank(shFirstName)) criteria.add(Restrictions.like("firstName", shFirstName.toUpperCase()));
		if(!StringUtils.isBlank(shLastName)) criteria.add(Restrictions.like("lastName", shLastName.toUpperCase()));
		
		List<Customer> list = customerService.findByCriteria(criteria);
		if(list.isEmpty()) {
			//TODO: not found
		} else if(list.size() == 1) {
			//TODO: found customer 1 records
		} else {
			//TODO: found customer more than 1
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		RequestContext rc = RequestContext.getCurrentInstance();
		rc.execute("PF('searchDlg').hide();");
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

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String getShCitizenId() {
		return shCitizenId;
	}

	public void setShCitizenId(String shCitizenId) {
		this.shCitizenId = shCitizenId;
	}

	public String getShFirstName() {
		return shFirstName;
	}

	public void setShFirstName(String shFirstName) {
		this.shFirstName = shFirstName;
	}

	public String getShLastName() {
		return shLastName;
	}

	public void setShLastName(String shLastName) {
		this.shLastName = shLastName;
	}

}
