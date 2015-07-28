package com.adms.web.bean.customer.enquiry;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.adms.cs.service.CustomerService;
import com.adms.cs.service.CustomerYesRecordService;
import com.adms.entity.cs.Customer;
import com.adms.entity.cs.CustomerYesRecord;
import com.adms.util.MessageUtils;
import com.adms.web.base.bean.BaseBean;
import com.adms.web.base.bean.LanguageBean;

@ManagedBean
@ViewScoped
public class CustomerEnquiryView extends BaseBean {

	private static final long serialVersionUID = -7189621707509848797L;
	
	@ManagedProperty(value="#{language}")
	private LanguageBean language;
	
	@ManagedProperty(value="#{customerService}")
	private CustomerService customerService;
	
	@ManagedProperty(value="#{customerYesRecordService}")
	private CustomerYesRecordService customerYesRecordService;
	
	private ResourceBundle csMsg;
	private CustomerEnquiryModel model;
	
	private String shCitizenId;
	private String shFirstName;
	private String shLastName;
	private Date shDOB;
	
	private boolean showLogHistTbl;
	
	public CustomerEnquiryView() {
	}
	
	public void onSelectRow(SelectEvent event) {
		System.out.println("select: " + event.getObject());
	}
	
	@PostConstruct
	private void init() {
		csMsg = ResourceBundle.getBundle("com.adms.msg.cs.csMsg", new Locale(language.getLocaleCode()));
		clearModel();
		clearSh();
	}
	
	public void clearModel() {
		model = new CustomerEnquiryModel();
		this.showLogHistTbl = false;
	}
	
	public void clearSh() {
		shCitizenId = null;
		shDOB = null;
		shFirstName = null;
		shLastName = null;
	}
	
	public void prepDlg(String str) {
		if(str.equals(model.getSearchDlg())) {
			model.setDlgHeaderVal(csMsg.getString("modal.search.header.text"));
		} else {
			model.setDlgHeaderVal(csMsg.getString("modal.add.header.text"));
		}
	}
	
	public void doSearch() throws Exception {
		RequestContext rc = RequestContext.getCurrentInstance();
		
		if(StringUtils.isBlank(shCitizenId) && StringUtils.isBlank(shFirstName) && StringUtils.isBlank(shLastName)) {
			rc.execute("PF('searchDlg').jq.effect('shake', {times:5}, 100);");
			
			MessageUtils.getInstance().addErrorMessage("msgGrowl", "Please fills at least 1 field.");
			rc.update("frmMain:msgGrowl");
		} else {
			List<Customer> list = findCustomer();
			
			if(list.isEmpty()) {
				MessageUtils.getInstance().addErrorMessage("msgGrowl", "Customer not Found.");
				rc.update("frmMain:msgGrowl");
			} else if(list.size() == 1) {
				model.setCustomer(list.get(0));
				clearSh();
				logicPolicyByCus();
				rc.execute("PF('searchDlg').hide();");
				rc.update("frmMain");
			} else {
				model.setCustomerFounds(list);
				rc.execute("PF('selectCustomerDlg').show();");
//				rc.execute("PF('searchDlg').hide();");
//				rc.update("frmMain");
			}
		}
	}
	
	public void onSelectCustomer(SelectEvent event) {
		clearSh();
		model.setCustomerFounds(null);
		model.setCustomerYRs(null);
		logicPolicyByCus();
	}
	
	public void doVisibleLogHistory() {
		this.showLogHistTbl = true;
	}
	
	private void logicPolicyByCus() {
		List<CustomerYesRecord> list = findPolicyByCustomer();
		if(list != null && !list.isEmpty()) {
			model.setCustomerYRs(list);
		}
	}
	
	private List<Customer> findCustomer() {
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
			if(!StringUtils.isBlank(shCitizenId)) criteria.add(Restrictions.eq("citizenId", shCitizenId));
			if(!StringUtils.isBlank(shFirstName)) criteria.add(Restrictions.like("firstName", "%" + shFirstName.trim().toUpperCase() + "%"));
			if(!StringUtils.isBlank(shLastName)) criteria.add(Restrictions.like("lastName", "%" + shLastName.trim().toUpperCase() + "%"));
			
			return customerService.findByCriteria(criteria);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private List<CustomerYesRecord> findPolicyByCustomer() {
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(CustomerYesRecord.class);
			criteria.add(Restrictions.eq("customer.citizenId", this.model.getCustomer().getCitizenId()));
			return customerYesRecordService.findByCriteria(criteria);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
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

	public Date getShDOB() {
		return shDOB;
	}

	public void setShDOB(Date shDOB) {
		this.shDOB = shDOB;
	}

	public void setCustomerYesRecordService(CustomerYesRecordService customerYesRecordService) {
		this.customerYesRecordService = customerYesRecordService;
	}

	public boolean isShowLogHistTbl() {
		return showLogHistTbl;
	}

	public void setShowLogHistTbl(boolean showLogHistTbl) {
		this.showLogHistTbl = showLogHistTbl;
	}

}
