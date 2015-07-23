package com.adms.web.base.bean;

import java.io.Serializable;
import java.util.ResourceBundle;
import java.util.TimeZone;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.adms.util.PropertyConfig;

@ManagedBean
public class BaseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private TimeZone timeZone;

	private Long nullLong;

	@ManagedProperty(value="#{globalMsg}")
	private ResourceBundle globalMsg;

	private String currentVersrion;

	protected final String SYSTEM_LOG_BY = "System";

	public BaseBean() {
		try {
			timeZone = TimeZone.getTimeZone(PropertyConfig.getInstance().getValue("cfg.timezone.asia.bangkok"));
			currentVersrion = PropertyConfig.getInstance().getValue("cfg.current.version");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getGlobalMsgValue(String key) {
		return globalMsg.getString(key);
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public Long getNullLong() {
		return nullLong;
	}

	public void setNullLong(Long nullLong) {
		this.nullLong = nullLong;
	}

	public void setGlobalMsg(ResourceBundle globalMsg) {
		this.globalMsg = globalMsg;
	}

	public String getCurrentVersrion() {
		return currentVersrion;
	}

	public void setCurrentVersrion(String currentVersrion) {
		this.currentVersrion = currentVersrion;
	}
	
}
