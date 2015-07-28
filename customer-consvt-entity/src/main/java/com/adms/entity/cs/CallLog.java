package com.adms.entity.cs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="CALL_LOG")
public class CallLog extends BaseAuditDomain {

	private static final long serialVersionUID = -3120190981448911783L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CALL_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date callDate;
	
	@Column(name="SOURCE")
	private String source;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER")
	private Customer customer;
	
	@Column(name="POLICY_NO")
	private String policyNo;

	@ManyToOne
	@JoinColumn(name="CHANNEL")
	private CallLogGroupStatus channel;
	
	@ManyToOne
	@JoinColumn(name="SUB_CATEGORY", referencedColumnName="CALL_LOG_DETAIL")
	private CallLogDetailCategory subCategory;
	
	@ManyToOne
	@JoinColumn(name="CALL_RESULT")
	private CallLogGroupStatus callResult;
	
	@ManyToOne
	@JoinColumn(name="CANCEL_REASON")
	private CallLogGroupStatus cancelReason;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCallDate() {
		return callDate;
	}

	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public CallLogGroupStatus getChannel() {
		return channel;
	}

	public void setChannel(CallLogGroupStatus channel) {
		this.channel = channel;
	}

	public CallLogDetailCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(CallLogDetailCategory subCategory) {
		this.subCategory = subCategory;
	}

	public CallLogGroupStatus getCallResult() {
		return callResult;
	}

	public void setCallResult(CallLogGroupStatus callResult) {
		this.callResult = callResult;
	}

	public CallLogGroupStatus getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(CallLogGroupStatus cancelReason) {
		this.cancelReason = cancelReason;
	}
	
}
