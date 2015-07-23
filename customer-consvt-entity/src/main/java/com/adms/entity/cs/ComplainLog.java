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
@Table(name="COMPLAIN_LOG")
public class ComplainLog extends BaseAuditDomain {

	private static final long serialVersionUID = -7009093185443977598L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CALL_DATE_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date callDateTime;
	
	@Column(name="POLICY_ID")
	private String policyId;
	
	@Column(name="CHANGED_NAME")
	private String changedName;
	
	@Column(name="CHANGED_CITIZEN_ID")
	private String changedCitizenId;

	@Column(name="CHANGED_GENDER")
	private String changedGender;
	
	@Column(name="CHANGED_BIRTH_DATE")
	@Temporal(TemporalType.DATE)
	private Date changedBirthDate;
	
	@Column(name="CHANGED_MOBILE_NO")
	private String changedMobileNo;
	
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

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getChangedName() {
		return changedName;
	}

	public void setChangedName(String changedName) {
		this.changedName = changedName;
	}

	public String getChangedCitizenId() {
		return changedCitizenId;
	}

	public void setChangedCitizenId(String changedCitizenId) {
		this.changedCitizenId = changedCitizenId;
	}

	public String getChangedGender() {
		return changedGender;
	}

	public void setChangedGender(String changedGender) {
		this.changedGender = changedGender;
	}

	public Date getChangedBirthDate() {
		return changedBirthDate;
	}

	public void setChangedBirthDate(Date changedBirthDate) {
		this.changedBirthDate = changedBirthDate;
	}

	public String getChangedMobileNo() {
		return changedMobileNo;
	}

	public void setChangedMobileNo(String changedMobileNo) {
		this.changedMobileNo = changedMobileNo;
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

	public Date getCallDateTime() {
		return callDateTime;
	}

	public void setCallDateTime(Date callDateTime) {
		this.callDateTime = callDateTime;
	}

}
