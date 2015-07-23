package com.adms.entity.cs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.adms.common.domain.BaseDomain;

@Entity
@Table(name="CALL_LOG_DETAIL_CATEGORY", schema="CS")
public class CallLogDetailCategory extends BaseDomain {

	private static final long serialVersionUID = -5647656581626061709L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="LEVEL_CALL_NATURE")
	private CallLogGroupStatus levelCallNature;
	
	@ManyToOne
	@JoinColumn(name="LEVEL_CALL_CATEGORY")
	private CallLogGroupStatus levelCallCategory;
	
	@ManyToOne
	@JoinColumn(name="CALL_LOG_DETAIL")
	private CallLogDetailValue callLogDetailValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CallLogGroupStatus getLevelCallNature() {
		return levelCallNature;
	}

	public void setLevelCallNature(CallLogGroupStatus levelCallNature) {
		this.levelCallNature = levelCallNature;
	}

	public CallLogGroupStatus getLevelCallCategory() {
		return levelCallCategory;
	}

	public void setLevelCallCategory(CallLogGroupStatus levelCallCategory) {
		this.levelCallCategory = levelCallCategory;
	}

	public CallLogDetailValue getCallLogDetailValue() {
		return callLogDetailValue;
	}

	public void setCallLogDetailValue(CallLogDetailValue callLogDetailValue) {
		this.callLogDetailValue = callLogDetailValue;
	}
	
}
