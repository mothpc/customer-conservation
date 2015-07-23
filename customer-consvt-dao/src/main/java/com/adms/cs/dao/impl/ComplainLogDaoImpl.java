package com.adms.cs.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.cs.dao.ComplainLogDao;
import com.adms.entity.cs.ComplainLog;

@Repository("complainLogDao")
public class ComplainLogDaoImpl extends GenericDaoHibernate<ComplainLog, Long> implements ComplainLogDao {
	
	public ComplainLogDaoImpl() {
		super(ComplainLog.class);
	}
}
