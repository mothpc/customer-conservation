package com.adms.entity.cs;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="CUSTOMER_YES_RECORD")
public class CustomerYesRecord extends BaseAuditDomain {

	private static final long serialVersionUID = 2580555342840606597L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="IMPORT_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date importDate;
	
	@Column(name="CAMPAIGN_CODE")
	private String campaignCode;
	
	@Column(name="LIST_LOT_CODE")
	private String listLotCode;
	
	@Column(name="FILE_OWNER")
	private String fileOwner;
	
	@Column(name="REFERENCE_NO")
	private String referenceNo;
	
	@Column(name="INSURED_TITLE")
	private String InsuredTitle;
	
	@Column(name="INSURED_FIRST_NAME")
	private String insuredFirstName;
	
	@Column(name="INSURED_LAST_NAME")
	private String insuredLastName;
	
	@Column(name="INSURED_NATIONAL")
	private String insuredNational;
	
	@Column(name="INSURED_CITIZEN_ID")
	private String insuredCitizenId;
	
	@Column(name="INSURED_PASSPORT_ID")
	private String insuredPassportId;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="INSURED_DOB")
	private String insuredDob;
	
	@Column(name="INSURED_MARITAL")
	private String insuredMarital;
	
	@Column(name="INSURED_OCCUPATION")
	private String insuredOccupation;
	
	@Column(name="INSURED_BANK_CODE")
	private String insuredBankCode;
	
	@Column(name="INSURED_ACCOUNT_TYPE")
	private String insuredAccountType;
	
	@Column(name="INSURED_ACCOUNT_NO")
	private String insuredAccountNo;
	
	@Column(name="INSURED_ACCOUNT_EXPIRED_DATE")
	@Temporal(TemporalType.DATE)
	private Date insuredAccountExpiredDate;
	
	@Column(name="INSURED_ADDRESS_1")
	private String insuredAddress1;
	
	@Column(name="INSURED_ADDRESS_2")
	private String insuredAddress2;
	
	@Column(name="INSURED_ADDRESS_3")
	private String insuredAddress3;
	
	@Column(name="INSURED_SUB_DISTRICT")
	private String insuredSubDistrict;
	
	@Column(name="INUSRED_DISTRICT")
	private String insuredDistrict;
	
	@Column(name="INSURED_PROVINCE")
	private String insuredProvince;
	
	@Column(name="INSURED_POST_CODE")
	private String insuredPostCode;
	
	@Column(name="INSURED_COUNTRY")
	private String insuredCountry;
	
	@Column(name="INSURED_MOBILE_NO")
	private String insuredMobileNo;
	
	@Column(name="INSURED_EMAIL")
	private String insuredEmail;
	
	@Column(name="SP_TITLE")
	private String spTitle;
	
	@Column(name="SP_FIRST_NAME")
	private String spFirstName;
	
	@Column(name="SP_LAST_NAME")
	private String spLastName;
	
	@Column(name="SP_NATIONAL")
	private String spNational;
	
	@Column(name="SP_CITIZEN_ID")
	private String spCitizenId;
	
	@Column(name="SP_PASSPORT_ID")
	private String spPassportId;
	
	@Column(name="SP_GENDER")
	private String spGender;
	
	@Column(name="SP_DOB")
	@Temporal(TemporalType.DATE)
	private Date spDob;
	
	@Column(name="SP_OCCUPATION")
	private String spOccupation;
	
	@Column(name="PREMIUM", scale=10)
	private BigDecimal premium;
	
	@Column(name="BENEFIT", scale=10)
	private BigDecimal benefit;
	
	@Column(name="BILL_FREQUENCY")
	private String billFrequency;
	
	@Column(name="BENE_1_FIRST_NAME")
	private String bene1FirstName;
	
	@Column(name="BENE_1_LAST_NAME")
	private String bene1LastName;
	
	@Column(name="BENE_1_PERCENT", scale=10)
	private BigDecimal bene1Percent;

	@Column(name="BENE_2_FIRST_NAME")
	private String bene2FirstName;

	@Column(name="BENE_2_LAST_NAME")
	private String bene2LastName;

	@Column(name="BENE_2_PERCENT", scale=10)
	private String bene2Percent;

	@Column(name="BENE_3_FIRST_NAME")
	private String bene3FirstName;

	@Column(name="BENE_3_LAST_NAME")
	private String bene3LastName;

	@Column(name="BENE_3_PERCENT", scale=10)
	private String bene3Percent;

	@Column(name="BENE_4_FIRST_NAME")
	private String bene4FirstName;

	@Column(name="BENE_4_LAST_NAME")
	private String bene4LastName;

	@Column(name="BENE_4_PERCENT", scale=10)
	private String bene4Percent;
	
	@Column(name="EFFECTIVE_DATE")
	@Temporal(TemporalType.DATE)
	private Date effectiveDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getImportDate() {
		return importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getListLotCode() {
		return listLotCode;
	}

	public void setListLotCode(String listLotCode) {
		this.listLotCode = listLotCode;
	}

	public String getFileOwner() {
		return fileOwner;
	}

	public void setFileOwner(String fileOwner) {
		this.fileOwner = fileOwner;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getInsuredTitle() {
		return InsuredTitle;
	}

	public void setInsuredTitle(String insuredTitle) {
		InsuredTitle = insuredTitle;
	}

	public String getInsuredFirstName() {
		return insuredFirstName;
	}

	public void setInsuredFirstName(String insuredFirstName) {
		this.insuredFirstName = insuredFirstName;
	}

	public String getInsuredLastName() {
		return insuredLastName;
	}

	public void setInsuredLastName(String insuredLastName) {
		this.insuredLastName = insuredLastName;
	}

	public String getInsuredNational() {
		return insuredNational;
	}

	public void setInsuredNational(String insuredNational) {
		this.insuredNational = insuredNational;
	}

	public String getInsuredCitizenId() {
		return insuredCitizenId;
	}

	public void setInsuredCitizenId(String insuredCitizenId) {
		this.insuredCitizenId = insuredCitizenId;
	}

	public String getInsuredPassportId() {
		return insuredPassportId;
	}

	public void setInsuredPassportId(String insuredPassportId) {
		this.insuredPassportId = insuredPassportId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInsuredDob() {
		return insuredDob;
	}

	public void setInsuredDob(String insuredDob) {
		this.insuredDob = insuredDob;
	}

	public String getInsuredMarital() {
		return insuredMarital;
	}

	public void setInsuredMarital(String insuredMarital) {
		this.insuredMarital = insuredMarital;
	}

	public String getInsuredOccupation() {
		return insuredOccupation;
	}

	public void setInsuredOccupation(String insuredOccupation) {
		this.insuredOccupation = insuredOccupation;
	}

	public String getInsuredBankCode() {
		return insuredBankCode;
	}

	public void setInsuredBankCode(String insuredBankCode) {
		this.insuredBankCode = insuredBankCode;
	}

	public String getInsuredAccountType() {
		return insuredAccountType;
	}

	public void setInsuredAccountType(String insuredAccountType) {
		this.insuredAccountType = insuredAccountType;
	}

	public String getInsuredAccountNo() {
		return insuredAccountNo;
	}

	public void setInsuredAccountNo(String insuredAccountNo) {
		this.insuredAccountNo = insuredAccountNo;
	}

	public Date getInsuredAccountExpiredDate() {
		return insuredAccountExpiredDate;
	}

	public void setInsuredAccountExpiredDate(Date insuredAccountExpiredDate) {
		this.insuredAccountExpiredDate = insuredAccountExpiredDate;
	}

	public String getInsuredAddress1() {
		return insuredAddress1;
	}

	public void setInsuredAddress1(String insuredAddress1) {
		this.insuredAddress1 = insuredAddress1;
	}

	public String getInsuredAddress2() {
		return insuredAddress2;
	}

	public void setInsuredAddress2(String insuredAddress2) {
		this.insuredAddress2 = insuredAddress2;
	}

	public String getInsuredAddress3() {
		return insuredAddress3;
	}

	public void setInsuredAddress3(String insuredAddress3) {
		this.insuredAddress3 = insuredAddress3;
	}

	public String getInsuredSubDistrict() {
		return insuredSubDistrict;
	}

	public void setInsuredSubDistrict(String insuredSubDistrict) {
		this.insuredSubDistrict = insuredSubDistrict;
	}

	public String getInsuredDistrict() {
		return insuredDistrict;
	}

	public void setInsuredDistrict(String insuredDistrict) {
		this.insuredDistrict = insuredDistrict;
	}

	public String getInsuredProvince() {
		return insuredProvince;
	}

	public void setInsuredProvince(String insuredProvince) {
		this.insuredProvince = insuredProvince;
	}

	public String getInsuredPostCode() {
		return insuredPostCode;
	}

	public void setInsuredPostCode(String insuredPostCode) {
		this.insuredPostCode = insuredPostCode;
	}

	public String getInsuredCountry() {
		return insuredCountry;
	}

	public void setInsuredCountry(String insuredCountry) {
		this.insuredCountry = insuredCountry;
	}

	public String getInsuredMobileNo() {
		return insuredMobileNo;
	}

	public void setInsuredMobileNo(String insuredMobileNo) {
		this.insuredMobileNo = insuredMobileNo;
	}

	public String getInsuredEmail() {
		return insuredEmail;
	}

	public void setInsuredEmail(String insuredEmail) {
		this.insuredEmail = insuredEmail;
	}

	public String getSpTitle() {
		return spTitle;
	}

	public void setSpTitle(String spTitle) {
		this.spTitle = spTitle;
	}

	public String getSpFirstName() {
		return spFirstName;
	}

	public void setSpFirstName(String spFirstName) {
		this.spFirstName = spFirstName;
	}

	public String getSpLastName() {
		return spLastName;
	}

	public void setSpLastName(String spLastName) {
		this.spLastName = spLastName;
	}

	public String getSpNational() {
		return spNational;
	}

	public void setSpNational(String spNational) {
		this.spNational = spNational;
	}

	public String getSpCitizenId() {
		return spCitizenId;
	}

	public void setSpCitizenId(String spCitizenId) {
		this.spCitizenId = spCitizenId;
	}

	public String getSpPassportId() {
		return spPassportId;
	}

	public void setSpPassportId(String spPassportId) {
		this.spPassportId = spPassportId;
	}

	public String getSpGender() {
		return spGender;
	}

	public void setSpGender(String spGender) {
		this.spGender = spGender;
	}

	public Date getSpDob() {
		return spDob;
	}

	public void setSpDob(Date spDob) {
		this.spDob = spDob;
	}

	public String getSpOccupation() {
		return spOccupation;
	}

	public void setSpOccupation(String spOccupation) {
		this.spOccupation = spOccupation;
	}

	public BigDecimal getPremium() {
		return premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

	public BigDecimal getBenefit() {
		return benefit;
	}

	public void setBenefit(BigDecimal benefit) {
		this.benefit = benefit;
	}

	public String getBillFrequency() {
		return billFrequency;
	}

	public void setBillFrequency(String billFrequency) {
		this.billFrequency = billFrequency;
	}

	public String getBene1FirstName() {
		return bene1FirstName;
	}

	public void setBene1FirstName(String bene1FirstName) {
		this.bene1FirstName = bene1FirstName;
	}

	public String getBene1LastName() {
		return bene1LastName;
	}

	public void setBene1LastName(String bene1LastName) {
		this.bene1LastName = bene1LastName;
	}

	public BigDecimal getBene1Percent() {
		return bene1Percent;
	}

	public void setBene1Percent(BigDecimal bene1Percent) {
		this.bene1Percent = bene1Percent;
	}

	public String getBene2FirstName() {
		return bene2FirstName;
	}

	public void setBene2FirstName(String bene2FirstName) {
		this.bene2FirstName = bene2FirstName;
	}

	public String getBene2LastName() {
		return bene2LastName;
	}

	public void setBene2LastName(String bene2LastName) {
		this.bene2LastName = bene2LastName;
	}

	public String getBene2Percent() {
		return bene2Percent;
	}

	public void setBene2Percent(String bene2Percent) {
		this.bene2Percent = bene2Percent;
	}

	public String getBene3FirstName() {
		return bene3FirstName;
	}

	public void setBene3FirstName(String bene3FirstName) {
		this.bene3FirstName = bene3FirstName;
	}

	public String getBene3LastName() {
		return bene3LastName;
	}

	public void setBene3LastName(String bene3LastName) {
		this.bene3LastName = bene3LastName;
	}

	public String getBene3Percent() {
		return bene3Percent;
	}

	public void setBene3Percent(String bene3Percent) {
		this.bene3Percent = bene3Percent;
	}

	public String getBene4FirstName() {
		return bene4FirstName;
	}

	public void setBene4FirstName(String bene4FirstName) {
		this.bene4FirstName = bene4FirstName;
	}

	public String getBene4LastName() {
		return bene4LastName;
	}

	public void setBene4LastName(String bene4LastName) {
		this.bene4LastName = bene4LastName;
	}

	public String getBene4Percent() {
		return bene4Percent;
	}

	public void setBene4Percent(String bene4Percent) {
		this.bene4Percent = bene4Percent;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
}
