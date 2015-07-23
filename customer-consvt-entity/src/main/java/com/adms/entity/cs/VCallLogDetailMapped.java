package com.adms.entity.cs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.adms.common.domain.BaseDomain;

@Entity
@Table(name="V_CALL_LOG_DETAIL_MAPPED")
public class VCallLogDetailMapped extends BaseDomain {
	
	private static final long serialVersionUID = -1845005687093963538L;

	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="NATURE_VALUE")
	private String natureValue;
	
	@Column(name="CATEGORY_VALUE")
	private String categoryValue;
	
	@Column(name="DETAIL")
	private String detail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNatureValue() {
		return natureValue;
	}

	public void setNatureValue(String natureValue) {
		this.natureValue = natureValue;
	}

	public String getCategoryValue() {
		return categoryValue;
	}

	public void setCategoryValue(String categoryValue) {
		this.categoryValue = categoryValue;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
